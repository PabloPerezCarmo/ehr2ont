/*
 *CISEP - An intelligent clinical record to improve patient security
 *
 *Copyright (c) 2007-2008, Information Eng. Research Unit - Univ. of Alcalá
 *http://www.cc.uah.es/ie
 *
 *This library is free software; you can redistribute it and/or modify it under
 *the terms of the GNU Lesser General Public License as published by the Free
 *Software Foundation; either version 2.1 of the License, or (at your option)
 *any later version.
 *This library is distributed in the hope that it will be useful, but WITHOUT
 *ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 *FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 *details.
 *You should have received a copy of the GNU Lesser General Public License along
 *with this library; if not, write to the Free Software Foundation, Inc.,
 *59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package es.uah.cc.ie.ehr2ont.translator;

/**
 *
 * @author Rosmary Calzadilla
 */
import es.uah.cc.ie.ehr2ont.parser.UAHJenaOWLModel;
import org.openehr.am.archetype.Archetype;
import org.openehr.am.archetype.constraintmodel.CObject;


public class ItemListTranslator extends ItemStructTranslator
{
    public ItemListTranslator(Archetype arc, UAHJenaOWLModel model, CObject co, Translator superTrans)
    {
        super(arc, model, co, superTrans);
        this.supClsName = "dsrm:ITEM_LIST";
    }
}
