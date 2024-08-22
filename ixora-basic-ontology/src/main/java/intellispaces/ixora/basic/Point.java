package intellispaces.ixora.basic;

import tech.intellispaces.core.annotation.Domain;
import tech.intellispaces.core.annotation.Transition;
import tech.intellispaces.javastatements.type.Type;

/**
 * Semantic space point.
 */
@Domain("01909034-27be-70d5-8033-7967d56fd62d")
public interface Point {

  @Transition("bcdfe93c-e2ec-4c51-a83b-e2ff2b48b9db")
  Type<?> domain();
}
