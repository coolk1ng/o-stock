package com.coolk1ng.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 许可证model
 *
 * @author coolk1ng
 * @since 2022/9/18 19:43
 */
@Getter @Setter @ToString
public class License {

    private int id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;
}
