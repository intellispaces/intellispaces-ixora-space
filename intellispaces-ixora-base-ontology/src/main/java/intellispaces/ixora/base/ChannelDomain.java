package intellispaces.ixora.base;

import intellispaces.framework.core.annotation.Channel;
import intellispaces.framework.core.annotation.Domain;

/**
 * Domain of objects represented semantic space channel.<p/>
 *
 * Channel types could not have type parameters.
 */
@Domain("cfb5a7d8-6812-4dbe-81f6-14ff4855e6d1")
public interface ChannelDomain extends PointDomain {

  @Channel("708c11b9-df80-43ef-a820-2d976ff779b6")
  PointDomain asPoint();

  @Channel("5d1bf548-23cf-4e4b-8e55-cd9979f73635")
  String tid();

  @Channel("019078a1-8372-7e53-8e06-dc83e0c11b97")
  String simpleName();

  @Channel("019078a1-b1f9-7f68-8f5e-0e9ff6af3b6e")
  String alias();
}
