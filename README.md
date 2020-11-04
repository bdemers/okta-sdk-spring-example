Okta SDK + Spring Boot Example
==============================

Basic example application that uses the Okta SDK for Java in a Spring Boot application.

To use this project:

1. Clone it:
   ```sh
   git clone https://github.com/bdemers/okta-sdk-spring-example.git
   cd okta-sdk-spring-example
   ```

2. Configure it:

   Set the following to properties via any [Spring configuration technique](https://docs.spring.io/spring-boot/docs/1.5.6.RELEASE/reference/html/boot-features-external-config.html) 
   
   | Key | Description | |
   ------|----------------|-|
   | `okta.client.orgUrl` | Your Okta Url: `https://{yourOktaDomain}`, i.e. `https://dev-123456.okta.com` | [More Info](https://bit.ly/finding-okta-domain) |
   | `okta.client.token` | An Okta API token | See [creating an API token](https://developer.okta.com/docs/api/getting_started/getting_a_token) for more info. |
   
   For example, one easy way to get started is to add these properties to the `src/main/resources/application.properties` file in this repo:

   ```properties
   okta.client.orgUrl=https://dev-123456.okta.com
   okta.client.token=some-super-secret-api-token-here
   ```

   **NOTE:** Replace `https://dev-123456.okta.com` with your actual [Okta URL](https://bit.ly/finding-okta-domain).

3. Run it:

   ```shell
   ./mvnw spring-boot:run
   ```

## The Code

The full example is located [`DemoApplication`](/src/main/java/com/example/demo/DemoApplication.java) with a few comments to help you get started.
