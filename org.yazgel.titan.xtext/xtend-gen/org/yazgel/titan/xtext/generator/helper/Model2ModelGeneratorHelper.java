package org.yazgel.titan.xtext.generator.helper;

import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.yazgel.oop.OClass;
import org.yazgel.oop.ODataType;
import org.yazgel.oop.OFeature;
import org.yazgel.oop.OReference;
import org.yazgel.titan.xtext.generator.helper.BaseGeneratorHelper;

@SuppressWarnings("all")
public class Model2ModelGeneratorHelper extends BaseGeneratorHelper {
  protected String gettername(final OFeature f) {
    String _name = f.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return ("get" + _firstUpper);
  }
  
  protected String settername(final OFeature f) {
    String _name = f.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return ("set" + _firstUpper);
  }
  
  protected String addername(final OFeature f) {
    String _xifexpression = null;
    if ((f instanceof OReference)) {
      OClass _reference = ((OReference)f).getReference();
      String _name = _reference.getName();
      _xifexpression = ("add" + _name);
    } else {
      String _xifexpression_1 = null;
      if ((f instanceof ODataType)) {
        String _name_1 = ((ODataType)f).getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_1);
        _xifexpression_1 = ("add" + _firstUpper);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
