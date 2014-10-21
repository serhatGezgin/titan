package org.yazgel.titan.xtext.generator.helper;

import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.yazgel.oop.OClass;
import org.yazgel.oop.OPackage;

@SuppressWarnings("all")
public class BaseGeneratorHelper {
  protected String oClassPackageName(final OClass oc) {
    String _xblockexpression = null;
    {
      final ArrayList<String> p = this.packageNameList(oc);
      _xblockexpression = IterableExtensions.join(p, ".");
    }
    return _xblockexpression;
  }
  
  protected ArrayList<String> packageNameList(final OClass oc) {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
      EObject _eContainer = oc.eContainer();
      OPackage pack = ((OPackage) _eContainer);
      String _name = pack.getName();
      String[] _split = _name.split("\\.");
      CollectionExtensions.<String>addAll(list, _split);
      _xblockexpression = list;
    }
    return _xblockexpression;
  }
}
