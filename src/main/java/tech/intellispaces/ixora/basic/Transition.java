package tech.intellispaces.ixora.basic;

/**
 * Space transition.<p/>
 *
 * Transition types could not have type parameters.
 */
@tech.intellispaces.framework.core.annotation.Domain("cfb5a7d8-6812-4dbe-81f6-14ff4855e6d1")
public interface Transition {

  @tech.intellispaces.framework.core.annotation.Transition("5d1bf548-23cf-4e4b-8e55-cd9979f73635")
  String tid();

  @tech.intellispaces.framework.core.annotation.Transition("019078a1-8372-7e53-8e06-dc83e0c11b97")
  String simpleName();

  @tech.intellispaces.framework.core.annotation.Transition("019078a1-b1f9-7f68-8f5e-0e9ff6af3b6e")
  String alias();
}
