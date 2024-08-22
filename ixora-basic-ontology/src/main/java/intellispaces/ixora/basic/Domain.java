package intellispaces.ixora.basic;

import tech.intellispaces.core.annotation.Transition;

/**
 * Semantic space domain.<p/>
 *
 * Each point of this domain represents domain.<p/>
 *
 * Any domain type can include type parameters. Type parameters indicates connection of this domain with other domains.
 */
@tech.intellispaces.core.annotation.Domain("1a243181-9d2b-48d2-bbcf-cd1f18311011")
public interface Domain extends Point {

  @Transition("1d9a3eaf-cb88-4d0a-84a1-5e6b21235aa9")
  Point asPoint();
}
