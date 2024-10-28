package intellispaces.ixora.space;

import intellispaces.jaquarius.annotation.Channel;
import intellispaces.jaquarius.annotation.Domain;

/**
 * Domain of objects represented semantic space domains.<p/>
 *
 * Any domain type can include type parameters. Type parameters indicates connection of this domain with other domains.
 */
@Domain("1a243181-9d2b-48d2-bbcf-cd1f18311011")
public interface DomainDomain extends PointDomain {

  @Channel("1d9a3eaf-cb88-4d0a-84a1-5e6b21235aa9")
  PointDomain asPoint();
}
