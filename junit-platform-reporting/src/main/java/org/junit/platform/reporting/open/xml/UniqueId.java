package org.junit.platform.reporting.open.xml;

import org.opentest4j.reporting.events.api.ChildElement;
import org.opentest4j.reporting.events.api.Context;
import org.opentest4j.reporting.events.api.QualifiedName;
import org.opentest4j.reporting.events.core.Metadata;

class UniqueId extends ChildElement<Metadata, UniqueId> {

    static final QualifiedName ELEMENT = QualifiedName.of(JUnitFactory.NAMESPACE, "uniqueId");

    UniqueId(Context context, org.junit.platform.engine.UniqueId value) {
        super(context, ELEMENT);
        withContent(value.toString());
    }
}
