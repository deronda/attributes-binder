
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

package org.carrot2.util.attribute.test.binder;

import org.carrot2.util.attribute.Attribute;
import org.carrot2.util.attribute.Bindable;
import org.carrot2.util.attribute.Input;
import org.carrot2.util.attribute.TestProcessing;
import org.carrot2.util.attribute.constraint.ImplementingClasses;

@Bindable
@SuppressWarnings("unused")
public class NonprimitiveAttribute
{
    /**
     * Nonprimitive. 
     */
    @TestProcessing
    @Input
    @Attribute
    @ImplementingClasses(classes =
    {
        BindableReferenceImpl1.class, BindableReferenceImpl2.class
    })
    public IBindableReference resource = new BindableReferenceImpl1();
}
