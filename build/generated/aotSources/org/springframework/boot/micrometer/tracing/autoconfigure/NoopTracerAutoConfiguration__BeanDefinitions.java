package org.springframework.boot.micrometer.tracing.autoconfigure;

import io.micrometer.tracing.Tracer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link NoopTracerAutoConfiguration}.
 */
@Generated
public class NoopTracerAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'noopTracerAutoConfiguration'.
   */
  public static BeanDefinition getNoopTracerAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(NoopTracerAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(NoopTracerAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'noopTracer'.
   */
  private static BeanInstanceSupplier<Tracer> getNoopTracerInstanceSupplier() {
    return BeanInstanceSupplier.<Tracer>forFactoryMethod(NoopTracerAutoConfiguration.class, "noopTracer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.micrometer.tracing.autoconfigure.NoopTracerAutoConfiguration", NoopTracerAutoConfiguration.class).noopTracer());
  }

  /**
   * Get the bean definition for 'noopTracer'.
   */
  public static BeanDefinition getNoopTracerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Tracer.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.micrometer.tracing.autoconfigure.NoopTracerAutoConfiguration");
    beanDefinition.setInstanceSupplier(getNoopTracerInstanceSupplier());
    return beanDefinition;
  }
}
