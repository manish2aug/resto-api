//package in.co.restoapi.configs;
//
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.hateoas.client.LinkDiscoverer;
//import org.springframework.hateoas.client.LinkDiscoverers;
//import org.springframework.hateoas.mediatype.collectionjson.CollectionJsonLinkDiscoverer;
//import org.springframework.http.codec.ServerCodecConfigurer;
//import org.springframework.plugin.core.SimplePluginRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig extends WebMvcConfigurationSupport {
//    public SwaggerConfig() {
//    }
//
//    ApiInfo apiInfo() {
//        return (new ApiInfoBuilder()).title("Simple Permission-based Access Control").description("A simple permission-based access control system to allow planners to assign VIA workspace and API permissions to their assistants (e.g. secretaries). \n\n This service is not a full authorization service and is intended as a security utility, to be used together with CIF access token and validation, and user context provided by the VIA workspace.\n\n ## Permission Profile \nTo create a Permission Profile you need to first load Linked Users (see e.g. IntermediaryService) \n\n 1. Create permissions first...  POST /permissions  \n\n    Then load all system permissions to choose from  `GET /permissions` \n\n 2. Load existing profile  `GET /permissionProfiles?ownerHouseCode=039999&ownerCode=12345'` \n  If no result, it's a new profile. \n\n 3. Build up PermissionProfile through combining linked users with permissions selected.\n\n 4. If a new PermissionProfile  `POST /permissionProfiles` \n\n 5. If existing profile, update grants  `PUT /permissionProfiles/grants` \n\n 6. Fetch permissions for the user for the UI for specific planner codes  `GET /permissionProfiles/grants?ownerHouseCode=039999&ownerCode=060267` \n\n 7. The API verifies that the user has the appropriate permission(s)  `GET /permissionProfiles/grants?ownerHouseCode=039999&ownerCode=060267&scope=leads:edit`\n\n  ## Administrative functions \n\nAdministrative functions include  \n * managing permissions, \n  * user information (basic) or permission profiles,  \n * not accessible to planners (resource owners) or end-users. \n  * creating permission profiles for owners.\n").license("").licenseUrl("http://unlicense.org").termsOfServiceUrl("").version("1.0.0").contact(new Contact("", "", "roan.bester@momentum.co.za")).build();
//    }
//
//    @Bean
//    public Docket permissionsApi() {
//        return (new Docket(DocumentationType.SWAGGER_2)).select().apis(RequestHandlerSelectors.basePackage("momentum.retail.permissionservice.controller")).paths(PathSelectors.regex("/api.*")).build().apiInfo(this.apiInfo());
//    }
//
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler(new String[]{"swagger-ui.html"}).addResourceLocations(new String[]{"classpath:/META-INF/resources/"});
//        registry.addResourceHandler(new String[]{"/webjars/**"}).addResourceLocations(new String[]{"classpath:/META-INF/resources/webjars/"});
//    }
//
//    @Bean
//    public ServerCodecConfigurer serverCodecConfigurer() {
//        return ServerCodecConfigurer.create();
//    }
//
//    @Primary
//    @Bean
//    public LinkDiscoverers discoverers() {
//        List<LinkDiscoverer> plugins = new ArrayList();
//        plugins.add(new CollectionJsonLinkDiscoverer());
//        return new LinkDiscoverers(SimplePluginRegistry.create(plugins));
//    }
//}
