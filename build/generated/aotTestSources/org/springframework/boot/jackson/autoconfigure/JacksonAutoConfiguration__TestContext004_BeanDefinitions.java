package org.springframework.boot.jackson.autoconfigure;

import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.jackson.JsonComponentModule;
import org.springframework.boot.jackson.JsonMixinModule;
import org.springframework.boot.jackson.JsonMixinModuleEntries;
import org.springframework.context.ApplicationContext;
import tools.jackson.databind.json.JsonMapper;

/**
 * Bean definitions for {@link JacksonAutoConfiguration}.
 */
@Generated
public class JacksonAutoConfiguration__TestContext004_BeanDefinitions {
  /**
   * Get the bean definition for 'jacksonAutoConfiguration'.
   */
  public static BeanDefinition getJacksonAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(JacksonAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jsonComponentModule'.
   */
  private static BeanInstanceSupplier<JsonComponentModule> getJsonComponentModuleInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JsonComponentModule>forFactoryMethod(JacksonAutoConfiguration.class, "jsonComponentModule")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.jackson.autoconfigure.JacksonAutoConfiguration", JacksonAutoConfiguration.class).jsonComponentModule());
  }

  /**
   * Get the bean definition for 'jsonComponentModule'.
   */
  public static BeanDefinition getJsonComponentModuleBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JsonComponentModule.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.jackson.autoconfigure.JacksonAutoConfiguration");
    beanDefinition.setInstanceSupplier(getJsonComponentModuleInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jsonMapperBuilder'.
   */
  private static BeanInstanceSupplier<JsonMapper.Builder> getJsonMapperBuilderInstanceSupplier() {
    return BeanInstanceSupplier.<JsonMapper.Builder>forFactoryMethod(JacksonAutoConfiguration.class, "jsonMapperBuilder", List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.jackson.autoconfigure.JacksonAutoConfiguration", JacksonAutoConfiguration.class).jsonMapperBuilder(args.get(0)));
  }

  /**
   * Get the bean definition for 'jsonMapperBuilder'.
   */
  public static BeanDefinition getJsonMapperBuilderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JsonMapper.Builder.class);
    beanDefinition.setScope("prototype");
    beanDefinition.setFactoryBeanName("org.springframework.boot.jackson.autoconfigure.JacksonAutoConfiguration");
    beanDefinition.setInstanceSupplier(getJsonMapperBuilderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jacksonJsonMapper'.
   */
  private static BeanInstanceSupplier<JsonMapper> getJacksonJsonMapperInstanceSupplier() {
    return BeanInstanceSupplier.<JsonMapper>forFactoryMethod(JacksonAutoConfiguration.class, "jacksonJsonMapper", JsonMapper.Builder.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.jackson.autoconfigure.JacksonAutoConfiguration", JacksonAutoConfiguration.class).jacksonJsonMapper(args.get(0)));
  }

  /**
   * Get the bean definition for 'jacksonJsonMapper'.
   */
  public static BeanDefinition getJacksonJsonMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JsonMapper.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setFactoryBeanName("org.springframework.boot.jackson.autoconfigure.JacksonAutoConfiguration");
    beanDefinition.setInstanceSupplier(getJacksonJsonMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link JacksonAutoConfiguration.JacksonMixinConfiguration}.
   */
  @Generated
  public static class JacksonMixinConfiguration {
    /**
     * Get the bean definition for 'jacksonMixinConfiguration'.
     */
    public static BeanDefinition getJacksonMixinConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonAutoConfiguration.JacksonMixinConfiguration.class);
      beanDefinition.setInstanceSupplier(JacksonAutoConfiguration.JacksonMixinConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jsonMixinModule'.
     */
    private static BeanInstanceSupplier<JsonMixinModule> getJsonMixinModuleInstanceSupplier() {
      return BeanInstanceSupplier.<JsonMixinModule>forFactoryMethod(JacksonAutoConfiguration.JacksonMixinConfiguration.class, "jsonMixinModule", ApplicationContext.class, JsonMixinModuleEntries.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.jackson.autoconfigure.JacksonAutoConfiguration$JacksonMixinConfiguration", JacksonAutoConfiguration.JacksonMixinConfiguration.class).jsonMixinModule(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'jsonMixinModule'.
     */
    public static BeanDefinition getJsonMixinModuleBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JsonMixinModule.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.jackson.autoconfigure.JacksonAutoConfiguration$JacksonMixinConfiguration");
      beanDefinition.setInstanceSupplier(getJsonMixinModuleInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link JacksonAutoConfiguration.JacksonJsonMapperBuilderCustomizerConfiguration}.
   */
  @Generated
  public static class JacksonJsonMapperBuilderCustomizerConfiguration {
    /**
     * Get the bean definition for 'jacksonJsonMapperBuilderCustomizerConfiguration'.
     */
    public static BeanDefinition getJacksonJsonMapperBuilderCustomizerConfigurationBeanDefinition(
        ) {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonAutoConfiguration.JacksonJsonMapperBuilderCustomizerConfiguration.class);
      beanDefinition.setInstanceSupplier(JacksonAutoConfiguration.JacksonJsonMapperBuilderCustomizerConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'standardJsonMapperBuilderCustomizer'.
     */
    private static BeanInstanceSupplier<JacksonAutoConfiguration.JacksonJsonMapperBuilderCustomizerConfiguration.StandardJsonMapperBuilderCustomizer> getStandardJsonMapperBuilderCustomizerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<JacksonAutoConfiguration.JacksonJsonMapperBuilderCustomizerConfiguration.StandardJsonMapperBuilderCustomizer>forFactoryMethod(JacksonAutoConfiguration.JacksonJsonMapperBuilderCustomizerConfiguration.class, "standardJsonMapperBuilderCustomizer", JacksonProperties.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.jackson.autoconfigure.JacksonAutoConfiguration$JacksonJsonMapperBuilderCustomizerConfiguration", JacksonAutoConfiguration.JacksonJsonMapperBuilderCustomizerConfiguration.class).standardJsonMapperBuilderCustomizer(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'standardJsonMapperBuilderCustomizer'.
     */
    public static BeanDefinition getStandardJsonMapperBuilderCustomizerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonAutoConfiguration.JacksonJsonMapperBuilderCustomizerConfiguration.StandardJsonMapperBuilderCustomizer.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.jackson.autoconfigure.JacksonAutoConfiguration$JacksonJsonMapperBuilderCustomizerConfiguration");
      beanDefinition.setInstanceSupplier(getStandardJsonMapperBuilderCustomizerInstanceSupplier());
      return beanDefinition;
    }
  }
}
