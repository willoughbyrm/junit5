package org.junit.platform.reporting.open.xml;

import org.junit.platform.engine.TestDescriptor;
import org.opentest4j.reporting.events.api.ChildElement;
import org.opentest4j.reporting.events.api.Context;
import org.opentest4j.reporting.events.api.QualifiedName;
import org.opentest4j.reporting.events.core.Metadata;

class Type extends ChildElement<Metadata, Type> {

    public static final QualifiedName ELEMENT = QualifiedName.of(JUnitFactory.NAMESPACE, "type");

    Type(Context context, TestDescriptor.Type type) {
        super(context, ELEMENT);
        withContent(type.toString());
    }
}
