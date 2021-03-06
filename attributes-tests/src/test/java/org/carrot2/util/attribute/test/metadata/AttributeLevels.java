
/*
 * Carrot2 project.
 *
 * Copyright (C) 2002-2012, Dawid Weiss, Stanisław Osiński.
 * All rights reserved.
 *
 * Refer to the full license file "carrot2.LICENSE"
 * in the root folder of the repository checkout or at:
 * http://www.carrot2.org/carrot2.LICENSE
 */

package org.carrot2.util.attribute.test.metadata;

import org.carrot2.util.attribute.Attribute;
import org.carrot2.util.attribute.AttributeLevel;
import org.carrot2.util.attribute.Bindable;
import org.carrot2.util.attribute.Input;
import org.carrot2.util.attribute.Level;
import org.carrot2.util.attribute.TestInit;

/**
 *
 */
@Bindable
@SuppressWarnings("unused")
public class AttributeLevels
{
    @TestInit
    @Input
    @Attribute
    @Level(AttributeLevel.BASIC)
    private int basicLevel;

    @TestInit
    @Input
    @Attribute
    @Level(AttributeLevel.MEDIUM)
    private int mediumLevel;

    @TestInit
    @Input
    @Attribute
    @Level(AttributeLevel.ADVANCED)
    private int advancedLevel;

    @TestInit
    @Input
    @Attribute
    private int noLevel;
}
