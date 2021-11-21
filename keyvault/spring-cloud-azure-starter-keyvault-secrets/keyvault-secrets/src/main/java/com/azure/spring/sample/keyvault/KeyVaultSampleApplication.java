// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.sample.keyvault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeyVaultSampleApplication implements CommandLineRunner {

    @Value("${spring-data-source-url}")
    private String springDataSourceUrl;

    public static void main(String[] args) {
        SpringApplication.run(KeyVaultSampleApplication.class, args);
    }

    public void run(String[] args) {
        System.out.println("property springDataSourceUrl in Azure Key Vault: " + springDataSourceUrl);
    }

}
