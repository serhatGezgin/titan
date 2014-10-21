package org.yazgel.titan.xtext.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.yazgel.oop.OClass;
import org.yazgel.oop.OPackage;
import org.yazgel.titan.xtext.generator.BaseGeneratorHelper;

@SuppressWarnings("all")
public class Model2TextGeneratorHelper extends BaseGeneratorHelper {
  /**
   * Base Package hatirlanmasi gerek.
   */
  protected static OPackage basePackage;
  
  protected String oClassFileName(final OClass oc) {
    String _xblockexpression = null;
    {
      final ArrayList<String> p = this.packageNameList(oc);
      String _join = IterableExtensions.join(p, "/");
      String _plus = (_join + "/");
      String _name = oc.getName();
      String _plus_1 = (_plus + _name);
      _xblockexpression = (_plus_1 + ".java");
    }
    return _xblockexpression;
  }
  
  protected List<OClass> allOClasses(final OPackage p) {
    ArrayList<OClass> _xblockexpression = null;
    {
      final ArrayList<OClass> list = CollectionLiterals.<OClass>newArrayList();
      Stack<EObject> stack = new Stack<EObject>();
      stack.push(p);
      while ((!stack.isEmpty())) {
        {
          EObject item = stack.pop();
          if ((item instanceof OPackage)) {
            EList<OClass> _classes = ((OPackage)item).getClasses();
            stack.addAll(_classes);
          } else {
            if ((item instanceof OClass)) {
              list.add(((OClass)item));
            }
          }
        }
      }
      _xblockexpression = list;
    }
    return _xblockexpression;
  }
}
