package tech.intellispaces.ixora.space;

import tech.intellispaces.general.type.Type;
import tech.intellispaces.jaquarius.annotation.Channel;
import tech.intellispaces.jaquarius.annotation.Domain;

/**
 * Domain of objects represented semantic space points.
 */
@Domain("01909034-27be-70d5-8033-7967d56fd62d")
public interface PointDomain {

  /**
   * Basic point domain.
   */
  @Channel("bcdfe93c-e2ec-4c51-a83b-e2ff2b48b9db")
  Type<?> domain();
}
