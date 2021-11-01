package com.tx.demo;

import com.tx.demo.service.ProjectManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.tx.demo"})
@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
public class AspectjTxDemoApplication {

    @Qualifier(value = "projectManagementService")
    @Autowired
    private static ProjectManagementService projectManagementService;

    public static void main(String[] args) {
        SpringApplication.run(AspectjTxDemoApplication.class, args);
        System.out.println(projectManagementService);
    }

}
