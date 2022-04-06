package com.hackathon.avengers.controller;

import com.hackathon.avengers.common.MRConstantsIntf;
import com.hackathon.avengers.dto.CodeSystemDto;
import com.hackathon.avengers.service.CodeSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/secure/api/code-system")
@Validated
public class CodeSystemController {

    @Autowired
    private CodeSystemService codeSystemService;

    @GetMapping("/document-format-type-code")
    public ResponseEntity<List<CodeSystemDto>> findAllDocumentFormatTypeCodes() {
        List<CodeSystemDto> dtos = codeSystemService.findMetaLookups(MRConstantsIntf.LOOKUP_NAME_DOCUMENT_FORMAT_TYPE_ID).stream()
                .map(meta -> {
                    CodeSystemDto dto = new CodeSystemDto();
                    dto.setCode(meta.getCode());
                    dto.setValue(meta.getLookupText());
                    return dto;
                }).collect(Collectors.toList());
        return ResponseEntity.ok(dtos);
    }
}
