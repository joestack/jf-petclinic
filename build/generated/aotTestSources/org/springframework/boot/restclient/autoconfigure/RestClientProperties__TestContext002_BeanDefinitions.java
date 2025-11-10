package org.springframework.boot.restclient.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RestClientProperties}.
 */
@Generated
public class RestClientProperties__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'restClientProperties'.
   */
  public static BeanDefinition getRestClientPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestClientProperties.class);
    beanDefinition.setInstanceSupplier(RestClientProperties::new);
    return beanDefinition;
  }
}
