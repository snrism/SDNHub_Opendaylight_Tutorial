package org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.acl.rev150722;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 *
 */
public enum ActionType {
    Allow(0),
    
    Drop(1)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, ActionType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ActionType> b = com.google.common.collect.ImmutableMap.builder();
        for (ActionType enumItem : ActionType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private ActionType(int value) {
        this.value = value;
    }

    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg
     * @return corresponding ActionType item
     */
    public static ActionType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
