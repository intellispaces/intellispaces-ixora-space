package intellispaces.ixora.core;

import javax.annotation.processing.Generated;

/**
 * Abstract object handle for domain {@link Object} objects.
 */
@Generated(
  value = "tech.intellispaces.framework.core.annotation.processor.domain.CommonObjectHandleGenerator",
  date = "2024-07-08T08:43:42.7703048+06:00",
  comments = "Generated with library intellispacesframework-core-0.0.1-SNAPSHOT.jar"
)
public interface ObjectHandle extends tech.intellispaces.framework.core.object.ObjectHandle<Object>, Object {

  @Override
  ObjectMovableHandle asMovableOrElseThrow();
}
