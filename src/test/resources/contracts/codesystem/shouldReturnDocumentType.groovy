package codesystem

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("GET Document Format Type")
    request {
        method 'GET'
        url '/secure/api/code-system/document-format-type-code'
    }
    response {
        status 200
        body(
                [
                        [
                                code: "test",
                                value: "12345"
                        ],
                        [
                                code: "test2",
                                value: "123457"
                        ]
                ]
        )
        headers {
            contentType(applicationJson())
        }
    }
}