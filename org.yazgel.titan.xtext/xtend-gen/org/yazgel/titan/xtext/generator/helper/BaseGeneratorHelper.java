package org.yazgel.titan.xtext.generator.helper;

import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.yazgel.oop.MultiODataType;
import org.yazgel.oop.MultiOReference;
import org.yazgel.oop.OClass;
import org.yazgel.oop.OFeature;
import org.yazgel.oop.OPackage;
import org.yazgel.oop.SingleODataType;
import org.yazgel.oop.SingleOReference;

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
  
  public String oFeatureType(final OFeature of, final boolean isGenericType) {
    if ((of instanceof SingleOReference)) {
      StringConcatenation _builder = new StringConcatenation();
      OClass _reference = ((SingleOReference)of).getReference();
      String _name = _reference.getName();
      _builder.append(_name, "");
      return _builder.toString();
    } else {
      if ((of instanceof MultiOReference)) {
        if (isGenericType) {
          boolean _isUniqueInstance = ((MultiOReference)of).isUniqueInstance();
          if (_isUniqueInstance) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Set<");
            OClass _reference_1 = ((MultiOReference)of).getReference();
            String _name_1 = _reference_1.getName();
            _builder_1.append(_name_1, "");
            _builder_1.append(">");
            return _builder_1.toString();
          }
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("List<");
          OClass _reference_2 = ((MultiOReference)of).getReference();
          String _name_2 = _reference_2.getName();
          _builder_2.append(_name_2, "");
          _builder_2.append(">");
          return _builder_2.toString();
        } else {
          boolean _isUniqueInstance_1 = ((MultiOReference)of).isUniqueInstance();
          if (_isUniqueInstance_1) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("TreeSet<");
            OClass _reference_3 = ((MultiOReference)of).getReference();
            String _name_3 = _reference_3.getName();
            _builder_3.append(_name_3, "");
            _builder_3.append(">");
            return _builder_3.toString();
          }
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("ArrayList<");
          OClass _reference_4 = ((MultiOReference)of).getReference();
          String _name_4 = _reference_4.getName();
          _builder_4.append(_name_4, "");
          _builder_4.append(">");
          return _builder_4.toString();
        }
      } else {
        if ((of instanceof SingleODataType)) {
          StringConcatenation _builder_5 = new StringConcatenation();
          String _type = ((SingleODataType)of).getType();
          _builder_5.append(_type, "");
          return _builder_5.toString();
        } else {
          if ((of instanceof MultiODataType)) {
            if (isGenericType) {
              boolean _isUniqueInstance_2 = ((MultiODataType)of).isUniqueInstance();
              if (_isUniqueInstance_2) {
                StringConcatenation _builder_6 = new StringConcatenation();
                _builder_6.append("Set<");
                String _type_1 = ((MultiODataType)of).getType();
                _builder_6.append(_type_1, "");
                _builder_6.append(">");
                return _builder_6.toString();
              }
              StringConcatenation _builder_7 = new StringConcatenation();
              _builder_7.append("List<");
              String _type_2 = ((MultiODataType)of).getType();
              _builder_7.append(_type_2, "");
              _builder_7.append(">");
              return _builder_7.toString();
            } else {
              boolean _isUniqueInstance_3 = ((MultiODataType)of).isUniqueInstance();
              if (_isUniqueInstance_3) {
                StringConcatenation _builder_8 = new StringConcatenation();
                _builder_8.append("TreeSet<");
                String _type_3 = ((MultiODataType)of).getType();
                _builder_8.append(_type_3, "");
                _builder_8.append(">");
                return _builder_8.toString();
              }
              StringConcatenation _builder_9 = new StringConcatenation();
              _builder_9.append("ArrayList<");
              String _type_4 = ((MultiODataType)of).getType();
              _builder_9.append(_type_4, "");
              _builder_9.append(">");
              return _builder_9.toString();
            }
          }
        }
      }
    }
    return null;
  }
}
