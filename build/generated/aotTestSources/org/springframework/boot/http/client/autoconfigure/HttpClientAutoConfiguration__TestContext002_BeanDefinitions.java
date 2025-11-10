package org.springframework.boot.http.client.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.http.client.ClientHttpRequestFactoryBuilder;
import org.springframework.boot.http.client.ClientHttpRequestFactorySettings;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;

/**
 * Bean definitions for {@link HttpClientAutoConfiguration}.
 */
@Generated
public class HttpClientAutoConfiguration__TestContext002_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.http.client.autoconfigure.HttpClientAutoConfiguration'.
   */
  private static BeanInstanceSupplier<HttpClientAutoConfiguration> getHttpClientAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HttpClientAutoConfiguration>forConstructor(Environment.class, ObjectProvider.class, HttpClientProperties.class)
            .withGenerator((registeredBean, args) -> new HttpClientAutoConfiguration(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'httpClientAutoConfiguration'.
   */
  public static BeanDefinition getHttpClientAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HttpClientAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(getHttpClientAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'clientHttpRequestFactoryBuilderOnPlatform'.
   */
  private static BeanInstanceSupplier<ClientHttpRequestFactoryBuilder> getClientHttpRequestFactoryBuilderOnPlatformInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ClientHttpRequestFactoryBuilder>forFactoryMethod(HttpClientAutoConfiguration.class, "clientHttpRequestFactoryBuilderOnPlatform", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.http.client.autoconfigure.HttpClientAutoConfiguration", HttpClientAutoConfiguration.class).clientHttpRequestFactoryBuilderOnPlatform(args.get(0)));
  }

  /**
   * Get the bean definition for 'clientHttpRequestFactoryBuilderOnPlatform'.
   */
  public static BeanDefinition getClientHttpRequestFactoryBuilderOnPlatformBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ClientHttpRequestFactoryBuilder.class);
    beanDefinition.setTargetType(ResolvableType.forClass(ClientHttpRequestFactoryBuilder.class));
    beanDefinition.setFactoryBeanName("org.springframework.boot.http.client.autoconfigure.HttpClientAutoConfiguration");
    beanDefinition.setInstanceSupplier(getClientHttpRequestFactoryBuilderOnPlatformInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'clientHttpRequestFactorySettings'.
   */
  private static BeanInstanceSupplier<ClientHttpRequestFactorySettings> getClientHttpRequestFactorySettingsInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ClientHttpRequestFactorySettings>forFactoryMethod(HttpClientAutoConfiguration.class, "clientHttpRequestFactorySettings")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.http.client.autoconfigure.HttpClientAutoConfiguration", HttpClientAutoConfiguration.class).clientHttpRequestFactorySettings());
  }

  /**
   * Get the bean definition for 'clientHttpRequestFactorySettings'.
   */
  public static BeanDefinition getClientHttpRequestFactorySettingsBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ClientHttpRequestFactorySettings.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.http.client.autoconfigure.HttpClientAutoConfiguration");
    beanDefinition.setInstanceSupplier(getClientHttpRequestFactorySettingsInstanceSupplier());
    return beanDefinition;
  }
}
