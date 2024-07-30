package intellispaces.ixora.core;

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

  @Override
  @Transition("01909039-39ce-7e5e-bf6f-5a3b9e6d1594")
  default Class<? extends Domain> domain() {
    return Domain.class;
  }
}
