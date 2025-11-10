package org.springframework.boot.micrometer.tracing.autoconfigure;

import io.micrometer.tracing.Tracer;
import io.micrometer.tracing.handler.DefaultTracingObservationHandler;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.micrometer.observation.autoconfigure.ObservationHandlerGroup;

/**
 * Bean definitions for {@link MicrometerTracingAutoConfiguration}.
 */
@Generated
public class MicrometerTracingAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'micrometerTracingAutoConfiguration'.
   */
  public static BeanDefinition getMicrometerTracingAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MicrometerTracingAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(MicrometerTracingAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'tracingObservationHandlerGroup'.
   */
  private static BeanInstanceSupplier<ObservationHandlerGroup> getTracingObservationHandlerGroupInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ObservationHandlerGroup>forFactoryMethod(MicrometerTracingAutoConfiguration.class, "tracingObservationHandlerGroup", Tracer.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.micrometer.tracing.autoconfigure.MicrometerTracingAutoConfiguration", MicrometerTracingAutoConfiguration.class).tracingObservationHandlerGroup(args.get(0)));
  }

  /**
   * Get the bean definition for 'tracingObservationHandlerGroup'.
   */
  public static BeanDefinition getTracingObservationHandlerGroupBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ObservationHandlerGroup.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.micrometer.tracing.autoconfigure.MicrometerTracingAutoConfiguration");
    beanDefinition.setInstanceSupplier(getTracingObservationHandlerGroupInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultTracingObservationHandler'.
   */
  private static BeanInstanceSupplier<DefaultTracingObservationHandler> getDefaultTracingObservationHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultTracingObservationHandler>forFactoryMethod(MicrometerTracingAutoConfiguration.class, "defaultTracingObservationHandler", Tracer.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.micrometer.tracing.autoconfigure.MicrometerTracingAutoConfiguration", MicrometerTracingAutoConfiguration.class).defaultTracingObservationHandler(args.get(0)));
  }

  /**
   * Get the bean definition for 'defaultTracingObservationHandler'.
   */
  public static BeanDefinition getDefaultTracingObservationHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultTracingObservationHandler.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.micrometer.tracing.autoconfigure.MicrometerTracingAutoConfiguration");
    beanDefinition.setInstanceSupplier(getDefaultTracingObservationHandlerInstanceSupplier());
    return beanDefinition;
  }
}
