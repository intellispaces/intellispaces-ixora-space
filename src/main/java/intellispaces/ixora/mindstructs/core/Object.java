package intellispaces.ixora.mindstructs.core;

import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;

/**
 * Domain of points that represented objects.
 */
@Domain("01909033-54a9-7f56-b321-89ba1aad6767")
public interface Object extends Point {

  @Override
  @Transition("01909039-91f5-78ca-bd53-65e97cf6f525")
  default Class<? extends Object> domain() {
    return intellispaces.ixora.mindstructs.core.Object.class;
  }
}
