package org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.acl.rev150722.acl.spec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.acl.rev150722.AclSpec;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.acl.rev150722.acl.spec.acl.IpAddressMatch;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;acl&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/acl.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * list acl {
 *     key "destination"
 *     leaf destination {
 *         type string;
 *     }
 *     container ip-address-match {
 *         leaf value {
 *             type ipv4-prefix;
 *         }
 *         leaf action {
 *             type action-type;
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;acl/acl-spec/acl&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.acl.rev150722.acl.spec.AclBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.acl.rev150722.acl.spec.AclBuilder
 * @see org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.acl.rev150722.acl.spec.AclKey
 *
 */
public interface Acl
    extends
    ChildOf<AclSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.acl.rev150722.acl.spec.Acl>,
    Identifiable<AclKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:sdnhub:odl:tutorial:acl","2015-07-22","acl"));

    java.lang.String getDestination();
    
    IpAddressMatch getIpAddressMatch();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    AclKey getKey();

}

