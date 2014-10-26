package org.yazgel.titan.xtext.generator.helper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.yazgel.oop.MultiODataType;
import org.yazgel.oop.MultiOReference;
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
  
  protected CharSequence oClassBuilderName(final OClass oc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Nested");
    String _name = oc.getName();
    _builder.append(_name, "");
    _builder.append("Builder");
    return _builder;
  }
  
  protected boolean isFeatureUnique(final OFeature f) {
    boolean _and = false;
    if (!(f instanceof MultiOReference)) {
      _and = false;
    } else {
      boolean _isUniqueInstance = ((MultiOReference) f).isUniqueInstance();
      _and = _isUniqueInstance;
    }
    if (_and) {
      return true;
    } else {
      boolean _and_1 = false;
      if (!(f instanceof MultiODataType)) {
        _and_1 = false;
      } else {
        boolean _isUniqueInstance_1 = ((MultiODataType) f).isUniqueInstance();
        _and_1 = _isUniqueInstance_1;
      }
      if (_and_1) {
        return true;
      }
    }
    return false;
  }
  
  protected boolean isFeatureOpposited(final OFeature f) {
    boolean _and = false;
    if (!(f instanceof MultiOReference)) {
      _and = false;
    } else {
      EList<OReference> _opposites = ((MultiOReference) f).getOpposites();
      boolean _isEmpty = _opposites.isEmpty();
      boolean _not = (!_isEmpty);
      _and = _not;
    }
    if (_and) {
      return true;
    } else {
      boolean _and_1 = false;
      if (!(f instanceof MultiODataType)) {
        _and_1 = false;
      } else {
        EList<ODataType> _opposites_1 = ((MultiODataType) f).getOpposites();
        boolean _isEmpty_1 = _opposites_1.isEmpty();
        boolean _not_1 = (!_isEmpty_1);
        _and_1 = _not_1;
      }
      if (_and_1) {
        return true;
      }
    }
    return false;
  }
  
  protected boolean isFeatureMulti(final OFeature f) {
    if ((f instanceof MultiOReference)) {
      return true;
    } else {
      if ((f instanceof MultiODataType)) {
        return true;
      }
    }
    return false;
  }
}
