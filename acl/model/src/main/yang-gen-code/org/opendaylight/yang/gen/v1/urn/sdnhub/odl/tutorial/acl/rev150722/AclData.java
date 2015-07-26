package org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.acl.rev150722;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * Access Control List configuration
 *
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;acl&lt;/b&gt;
 * &lt;br&gt;Source path: &lt;i&gt;META-INF/yang/acl.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * module acl {
 *     yang-version 1;
 *     namespace "urn:sdnhub:odl:tutorial:acl";
 *     prefix "acl";
 *
 *     import opendaylight-inventory { prefix "inv"; }
 *     
 *     import yang-ext { prefix "ext"; }
 *     
 *     import ietf-inet-types { prefix "inet"; }
 *     
 *     import opendaylight-md-sal-binding { prefix "mdsal"; }
 *     
 *     import config { prefix "config"; }
 *     revision 2015-07-22 {
 *         description "Access Control List configuration
 *         ";
 *     }
 *
 *     container acl-spec {
 *         leaf-list acl-list {
 *             type ipv4-prefix;
 *         }
 *         list acl {
 *             key "destination"
 *             leaf destination {
 *                 type string;
 *             }
 *             container ip-address-match {
 *                 leaf value {
 *                     type ipv4-prefix;
 *                 }
 *                 leaf action {
 *                     type action-type;
 *                 }
 *             }
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 *
 */
public interface AclData
    extends
    DataRoot
{




    AclSpec getAclSpec();

}

