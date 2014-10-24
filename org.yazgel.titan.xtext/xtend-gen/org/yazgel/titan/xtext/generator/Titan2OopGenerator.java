package org.yazgel.titan.xtext.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.yazgel.oop.MultiODataType;
import org.yazgel.oop.MultiOReference;
import org.yazgel.oop.OClass;
import org.yazgel.oop.ODataType;
import org.yazgel.oop.OFeature;
import org.yazgel.oop.OMethod;
import org.yazgel.oop.OModel;
import org.yazgel.oop.OPackage;
import org.yazgel.oop.OParameter;
import org.yazgel.oop.OReference;
import org.yazgel.oop.OStatement;
import org.yazgel.oop.SingleODataType;
import org.yazgel.oop.SingleOReference;
import org.yazgel.oop.impl.OopFactoryImpl;
import org.yazgel.titan.xtext.generator.helper.Model2ModelGeneratorHelper;
import org.yazgel.titan.xtext.titan.DataType;
import org.yazgel.titan.xtext.titan.DataTypes;
import org.yazgel.titan.xtext.titan.Entity;
import org.yazgel.titan.xtext.titan.Feature;
import org.yazgel.titan.xtext.titan.Module;
import org.yazgel.titan.xtext.titan.MultiDataType;
import org.yazgel.titan.xtext.titan.MultiReference;
import org.yazgel.titan.xtext.titan.Reference;
import org.yazgel.titan.xtext.titan.SingleDataType;
import org.yazgel.titan.xtext.titan.SingleReference;

@SuppressWarnings("all")
public class Titan2OopGenerator extends Model2ModelGeneratorHelper {
  public static Map<EObject, EObject> transformationReleations = new HashMap<EObject, EObject>();
  
  public static Map<EObject, EObject> modelBuilderReleations = new HashMap<EObject, EObject>();
  
  public static List<OFeature> oppositedOMultiReferences = CollectionLiterals.<OFeature>newArrayList();
  
  public OModel doGenerate(final Module module) {
    OModel _xblockexpression = null;
    {
      OModel model = OopFactoryImpl.eINSTANCE.createOModel();
      String _name = module.getName();
      model.setName(_name);
      Titan2OopGenerator.transformationReleations.put(module, model);
      Titan2OopGenerator.transformationReleations.put(model, module);
      EList<org.yazgel.titan.xtext.titan.Package> _packages = module.getPackages();
      for (final org.yazgel.titan.xtext.titan.Package p : _packages) {
        EList<OPackage> _packages_1 = model.getPackages();
        OPackage _generate = this.generate(p);
        _packages_1.add(_generate);
      }
      this.postGenerator(model);
      _xblockexpression = model;
    }
    return _xblockexpression;
  }
  
  public OPackage generate(final org.yazgel.titan.xtext.titan.Package tPackage) {
    OPackage _xblockexpression = null;
    {
      OPackage oPackage = OopFactoryImpl.eINSTANCE.createOPackage();
      String _name = tPackage.getName();
      oPackage.setName(_name);
      Titan2OopGenerator.transformationReleations.put(tPackage, oPackage);
      Titan2OopGenerator.transformationReleations.put(oPackage, tPackage);
      EList<Entity> _entities = tPackage.getEntities();
      for (final Entity e : _entities) {
        EList<OClass> _classes = oPackage.getClasses();
        OClass _generate = this.generate(e);
        _classes.add(_generate);
      }
      _xblockexpression = oPackage;
    }
    return _xblockexpression;
  }
  
  public OClass generate(final Entity entity) {
    OClass _xblockexpression = null;
    {
      OClass oClass = OopFactoryImpl.eINSTANCE.createOClass();
      String _name = entity.getName();
      oClass.setName(_name);
      Titan2OopGenerator.transformationReleations.put(entity, oClass);
      Titan2OopGenerator.transformationReleations.put(oClass, entity);
      EList<Feature> _features = entity.getFeatures();
      for (final Feature f : _features) {
        EList<OFeature> _features_1 = oClass.getFeatures();
        OFeature _generateFeature = this.generateFeature(f);
        _features_1.add(_generateFeature);
      }
      _xblockexpression = oClass;
    }
    return _xblockexpression;
  }
  
  protected OFeature _generateFeature(final Feature f) {
    return null;
  }
  
  protected ODataType _generateFeature(final DataType dt) {
    return null;
  }
  
  protected ODataType _generateFeature(final SingleDataType dt) {
    ODataType _xblockexpression = null;
    {
      ODataType data = null;
      SingleODataType _createSingleODataType = OopFactoryImpl.eINSTANCE.createSingleODataType();
      data = _createSingleODataType;
      StringConcatenation _builder = new StringConcatenation();
      DataTypes _type = dt.getType();
      _builder.append(_type, "");
      data.setType(_builder.toString());
      String _name = dt.getName();
      data.setName(_name);
      Titan2OopGenerator.transformationReleations.put(dt, data);
      Titan2OopGenerator.transformationReleations.put(data, dt);
      _xblockexpression = data;
    }
    return _xblockexpression;
  }
  
  protected ODataType _generateFeature(final MultiDataType dt) {
    ODataType _xblockexpression = null;
    {
      ODataType data = null;
      MultiODataType _createMultiODataType = OopFactoryImpl.eINSTANCE.createMultiODataType();
      data = _createMultiODataType;
      StringConcatenation _builder = new StringConcatenation();
      DataTypes _type = dt.getType();
      _builder.append(_type, "");
      data.setType(_builder.toString());
      String _name = dt.getName();
      data.setName(_name);
      Titan2OopGenerator.transformationReleations.put(dt, data);
      Titan2OopGenerator.transformationReleations.put(data, dt);
      _xblockexpression = data;
    }
    return _xblockexpression;
  }
  
  protected OReference _generateFeature(final Reference r) {
    return null;
  }
  
  protected OReference _generateFeature(final SingleReference r) {
    OReference _xblockexpression = null;
    {
      OReference ref = null;
      SingleOReference _createSingleOReference = OopFactoryImpl.eINSTANCE.createSingleOReference();
      ref = _createSingleOReference;
      Entity _reference = r.getReference();
      String _name = _reference.getName();
      ref.setType(_name);
      String _name_1 = r.getName();
      ref.setName(_name_1);
      Titan2OopGenerator.transformationReleations.put(r, ref);
      Titan2OopGenerator.transformationReleations.put(ref, r);
      _xblockexpression = ref;
    }
    return _xblockexpression;
  }
  
  protected OReference _generateFeature(final MultiReference r) {
    OReference _xblockexpression = null;
    {
      OReference ref = null;
      MultiOReference _createMultiOReference = OopFactoryImpl.eINSTANCE.createMultiOReference();
      ref = _createMultiOReference;
      StringConcatenation _builder = new StringConcatenation();
      Entity _reference = r.getReference();
      String _name = _reference.getName();
      _builder.append(_name, "");
      ref.setType(_builder.toString());
      boolean _isUnique = r.isUnique();
      if (_isUnique) {
        ((MultiOReference) ref).setUniqueInstance(true);
      }
      String _name_1 = r.getName();
      ref.setName(_name_1);
      Titan2OopGenerator.transformationReleations.put(r, ref);
      Titan2OopGenerator.transformationReleations.put(ref, r);
      _xblockexpression = ref;
    }
    return _xblockexpression;
  }
  
  public void postGenerator(final OModel model) {
    final Function2<EObject, EObject, Boolean> _function = new Function2<EObject, EObject, Boolean>() {
      public Boolean apply(final EObject p1, final EObject p2) {
        return Boolean.valueOf((p1 instanceof Feature));
      }
    };
    Map<EObject, EObject> releationsOfReferences = MapExtensions.<EObject, EObject>filter(Titan2OopGenerator.transformationReleations, _function);
    Set<Map.Entry<EObject, EObject>> _entrySet = releationsOfReferences.entrySet();
    for (final Map.Entry<EObject, EObject> e : _entrySet) {
      EObject _key = e.getKey();
      if ((_key instanceof Feature)) {
        EObject _key_1 = e.getKey();
        if ((_key_1 instanceof Reference)) {
          EObject _key_2 = e.getKey();
          Entity _reference = ((Reference) _key_2).getReference();
          EObject _get = Titan2OopGenerator.transformationReleations.get(_reference);
          OClass or = ((OClass) _get);
          EObject _value = e.getValue();
          ((OReference) _value).setReference(or);
          EObject _key_3 = e.getKey();
          MultiReference _opposite = ((Reference) _key_3).getOpposite();
          EObject _get_1 = Titan2OopGenerator.transformationReleations.get(_opposite);
          MultiOReference oo = ((MultiOReference) _get_1);
          EObject _value_1 = e.getValue();
          ((OReference) _value_1).setOpposite(oo);
          boolean _contains = Titan2OopGenerator.oppositedOMultiReferences.contains(oo);
          boolean _not = (!_contains);
          if (_not) {
            Titan2OopGenerator.oppositedOMultiReferences.add(((MultiOReference) oo));
          }
        } else {
          EObject _key_4 = e.getKey();
          if ((_key_4 instanceof DataType)) {
            EObject _key_5 = e.getKey();
            MultiDataType _opposite_1 = ((DataType) _key_5).getOpposite();
            EObject _get_2 = Titan2OopGenerator.transformationReleations.get(_opposite_1);
            MultiODataType oo_1 = ((MultiODataType) _get_2);
            EObject _value_2 = e.getValue();
            ((ODataType) _value_2).setOpposite(oo_1);
            boolean _contains_1 = Titan2OopGenerator.oppositedOMultiReferences.contains(oo_1);
            boolean _not_1 = (!_contains_1);
            if (_not_1) {
              Titan2OopGenerator.oppositedOMultiReferences.add(((MultiODataType) oo_1));
            }
          }
        }
      }
    }
    Set<Map.Entry<EObject, EObject>> _entrySet_1 = releationsOfReferences.entrySet();
    for (final Map.Entry<EObject, EObject> e_1 : _entrySet_1) {
      EObject _value_3 = e_1.getValue();
      if ((_value_3 instanceof OReference)) {
        EObject _value_4 = e_1.getValue();
        OReference oReference = ((OReference) _value_4);
        EObject _value_5 = e_1.getValue();
        EObject _eContainer = _value_5.eContainer();
        OClass oClass = ((OClass) _eContainer);
        if ((oReference instanceof MultiOReference)) {
          boolean _isUniqueInstance = ((MultiOReference) oReference).isUniqueInstance();
          if (_isUniqueInstance) {
            EList<String> _imports = oClass.getImports();
            _imports.add("java.util.Set");
            EList<String> _imports_1 = oClass.getImports();
            _imports_1.add("java.util.TreeSet");
          } else {
            EList<String> _imports_2 = oClass.getImports();
            _imports_2.add("java.util.List");
            EList<String> _imports_3 = oClass.getImports();
            _imports_3.add("java.util.ArrayList");
          }
        }
      }
    }
    final Function2<EObject, EObject, Boolean> _function_1 = new Function2<EObject, EObject, Boolean>() {
      public Boolean apply(final EObject p1, final EObject p2) {
        boolean _and = false;
        if (!(p1 instanceof OClass)) {
          _and = false;
        } else {
          EList<OFeature> _features = ((OClass) p1).getFeatures();
          final Function1<OFeature, Boolean> _function = new Function1<OFeature, Boolean>() {
            public Boolean apply(final OFeature f) {
              boolean _and = false;
              if (!(f instanceof MultiOReference)) {
                _and = false;
              } else {
                boolean _isUniqueInstance = ((MultiOReference) f).isUniqueInstance();
                _and = _isUniqueInstance;
              }
              return Boolean.valueOf(_and);
            }
          };
          Iterable<OFeature> _filter = IterableExtensions.<OFeature>filter(_features, _function);
          int _size = IterableExtensions.size(_filter);
          boolean _greaterThan = (_size > 0);
          _and = _greaterThan;
        }
        return Boolean.valueOf(_and);
      }
    };
    Map<EObject, EObject> oClasesWithUniqueInstanceOFeatures = MapExtensions.<EObject, EObject>filter(Titan2OopGenerator.transformationReleations, _function_1);
    Set<Map.Entry<EObject, EObject>> _entrySet_2 = oClasesWithUniqueInstanceOFeatures.entrySet();
    for (final Map.Entry<EObject, EObject> e_2 : _entrySet_2) {
      {
        EObject _key_6 = e_2.getKey();
        OClass oClass_1 = ((OClass) _key_6);
        EList<OFeature> _features = oClass_1.getFeatures();
        for (final OFeature f : _features) {
          boolean _and = false;
          if (!(f instanceof MultiOReference)) {
            _and = false;
          } else {
            boolean _isUniqueInstance_1 = ((MultiOReference) f).isUniqueInstance();
            _and = _isUniqueInstance_1;
          }
          if (_and) {
            OClass _reference_1 = ((MultiOReference) f).getReference();
            EList<String> _implements = _reference_1.getImplements();
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Comparable<");
            OClass _reference_2 = ((MultiOReference) f).getReference();
            String _name = _reference_2.getName();
            _builder.append(_name, "");
            _builder.append(">");
            _implements.add(_builder.toString());
          }
        }
      }
    }
    final Function2<EObject, EObject, Boolean> _function_2 = new Function2<EObject, EObject, Boolean>() {
      public Boolean apply(final EObject p1, final EObject p2) {
        return Boolean.valueOf((p1 instanceof OClass));
      }
    };
    Map<EObject, EObject> oClasses = MapExtensions.<EObject, EObject>filter(Titan2OopGenerator.transformationReleations, _function_2);
    Set<Map.Entry<EObject, EObject>> _entrySet_3 = oClasses.entrySet();
    for (final Map.Entry<EObject, EObject> e_3 : _entrySet_3) {
      {
        EObject _key_6 = e_3.getKey();
        OClass oc = ((OClass) _key_6);
        OMethod oConst = OopFactoryImpl.eINSTANCE.createOMethod();
        String _name = oc.getName();
        oConst.setName(_name);
        EList<OFeature> oFeatures = oc.getFeatures();
        for (final OFeature of : oFeatures) {
          {
            OStatement statement = OopFactoryImpl.eINSTANCE.createOStatement();
            if ((of instanceof MultiOReference)) {
              boolean _isUniqueInstance_1 = ((MultiOReference)of).isUniqueInstance();
              if (_isUniqueInstance_1) {
                StringConcatenation _builder = new StringConcatenation();
                String _name_1 = ((MultiOReference)of).getName();
                _builder.append(_name_1, "");
                _builder.append(" = new TreeSet<>();");
                statement.setContent(_builder.toString());
              } else {
                StringConcatenation _builder_1 = new StringConcatenation();
                String _name_2 = ((MultiOReference)of).getName();
                _builder_1.append(_name_2, "");
                _builder_1.append(" = new ArrayList<>();");
                statement.setContent(_builder_1.toString());
              }
            } else {
              if ((of instanceof MultiODataType)) {
                boolean _isUniqueInstance_2 = ((MultiODataType)of).isUniqueInstance();
                if (_isUniqueInstance_2) {
                  StringConcatenation _builder_2 = new StringConcatenation();
                  String _name_3 = ((MultiODataType)of).getName();
                  _builder_2.append(_name_3, "");
                  _builder_2.append(" = new TreeSet<>();");
                  statement.setContent(_builder_2.toString());
                } else {
                  StringConcatenation _builder_3 = new StringConcatenation();
                  String _name_4 = ((MultiODataType)of).getName();
                  _builder_3.append(_name_4, "");
                  _builder_3.append(" = new ArrayList<>();");
                  statement.setContent(_builder_3.toString());
                }
              }
            }
            EList<OStatement> _statements = oConst.getStatements();
            _statements.add(statement);
          }
        }
        EList<OMethod> _methods = oc.getMethods();
        _methods.add(oConst);
      }
    }
    Set<Map.Entry<EObject, EObject>> _entrySet_4 = oClasses.entrySet();
    for (final Map.Entry<EObject, EObject> e_4 : _entrySet_4) {
      {
        ArrayList<Object> list = CollectionLiterals.<Object>newArrayList();
        EObject _key_6 = e_4.getKey();
        OClass oc = ((OClass) _key_6);
        EList<OFeature> _features = oc.getFeatures();
        final Function1<OFeature, Boolean> _function_3 = new Function1<OFeature, Boolean>() {
          public Boolean apply(final OFeature of) {
            return Boolean.valueOf((of instanceof MultiOReference));
          }
        };
        Iterable<OFeature> _filter = IterableExtensions.<OFeature>filter(_features, _function_3);
        for (final OFeature of : _filter) {
          {
            MultiOReference f = ((MultiOReference) of);
            OClass _reference_1 = f.getReference();
            boolean _contains_2 = list.contains(_reference_1);
            boolean _not_2 = (!_contains_2);
            if (_not_2) {
              OMethod method = OopFactoryImpl.eINSTANCE.createOMethod();
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("add");
              OClass _reference_2 = f.getReference();
              String _name = _reference_2.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name);
              _builder.append(_firstUpper, "");
              method.setName(_builder.toString());
              method.setReturnType("void");
              OParameter parameter = OopFactoryImpl.eINSTANCE.createOParameter();
              OClass _reference_3 = f.getReference();
              String _name_1 = _reference_3.getName();
              String _firstLower = StringExtensions.toFirstLower(_name_1);
              parameter.setName(_firstLower);
              String _oFeatureType = this.oFeatureType(f, true);
              parameter.setType(_oFeatureType);
              EList<OParameter> _parameters = method.getParameters();
              _parameters.add(parameter);
              OStatement statement = OopFactoryImpl.eINSTANCE.createOStatement();
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("get");
              String _name_2 = f.getName();
              String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
              _builder_1.append(_firstUpper_1, "");
              _builder_1.append("().add(");
              String _name_3 = parameter.getName();
              _builder_1.append(_name_3, "");
              _builder_1.append(");");
              statement.setContent(_builder_1.toString());
              EList<OStatement> _statements = method.getStatements();
              _statements.add(statement);
              EList<OMethod> _methods = oc.getMethods();
              _methods.add(method);
              OClass _reference_4 = f.getReference();
              list.add(_reference_4);
            }
          }
        }
        EList<OFeature> _features_1 = oc.getFeatures();
        final Function1<OFeature, Boolean> _function_4 = new Function1<OFeature, Boolean>() {
          public Boolean apply(final OFeature odt) {
            return Boolean.valueOf((odt instanceof MultiODataType));
          }
        };
        Iterable<OFeature> _filter_1 = IterableExtensions.<OFeature>filter(_features_1, _function_4);
        for (final OFeature odt : _filter_1) {
          {
            MultiODataType dt = ((MultiODataType) odt);
            String _type = dt.getType();
            boolean _contains_2 = list.contains(_type);
            boolean _not_2 = (!_contains_2);
            if (_not_2) {
              OMethod method = OopFactoryImpl.eINSTANCE.createOMethod();
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("add");
              String _name = dt.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name);
              _builder.append(_firstUpper, "");
              method.setName(_builder.toString());
              method.setReturnType("void");
              OParameter parameter = OopFactoryImpl.eINSTANCE.createOParameter();
              String _name_1 = dt.getName();
              String _firstLower = StringExtensions.toFirstLower(_name_1);
              parameter.setName(_firstLower);
              String _oFeatureType = this.oFeatureType(dt, true);
              parameter.setType(_oFeatureType);
              EList<OParameter> _parameters = method.getParameters();
              _parameters.add(parameter);
              OStatement statement = OopFactoryImpl.eINSTANCE.createOStatement();
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("get");
              String _name_2 = dt.getName();
              String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
              _builder_1.append(_firstUpper_1, "");
              _builder_1.append("().add(");
              String _name_3 = parameter.getName();
              _builder_1.append(_name_3, "");
              _builder_1.append(");");
              statement.setContent(_builder_1.toString());
              EList<OStatement> _statements = method.getStatements();
              _statements.add(statement);
              EList<OMethod> _methods = oc.getMethods();
              _methods.add(method);
              String _type_1 = dt.getType();
              list.add(_type_1);
            }
          }
        }
      }
    }
    Set<Map.Entry<EObject, EObject>> _entrySet_5 = oClasses.entrySet();
    for (final Map.Entry<EObject, EObject> e_5 : _entrySet_5) {
      {
        EObject _key_6 = e_5.getKey();
        OClass oc = ((OClass) _key_6);
        EList<OFeature> _features = oc.getFeatures();
        final Function1<OFeature, Boolean> _function_3 = new Function1<OFeature, Boolean>() {
          public Boolean apply(final OFeature of) {
            return Boolean.valueOf((of instanceof ODataType));
          }
        };
        Iterable<OFeature> _filter = IterableExtensions.<OFeature>filter(_features, _function_3);
        for (final OFeature of : _filter) {
          {
            ODataType d = ((ODataType) of);
            OMethod gmethod = OopFactoryImpl.eINSTANCE.createOMethod();
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("get");
            String _name = d.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name);
            _builder.append(_firstUpper, "");
            gmethod.setName(_builder.toString());
            String _oFeatureType = this.oFeatureType(d, true);
            gmethod.setReturnType(_oFeatureType);
            OStatement statement = OopFactoryImpl.eINSTANCE.createOStatement();
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("return this.");
            String _name_1 = d.getName();
            _builder_1.append(_name_1, "");
            _builder_1.append(";");
            statement.setContent(_builder_1.toString());
            EList<OStatement> _statements = gmethod.getStatements();
            _statements.add(statement);
            EList<OMethod> _methods = oc.getMethods();
            _methods.add(gmethod);
            OMethod smethod = OopFactoryImpl.eINSTANCE.createOMethod();
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("set");
            String _name_2 = d.getName();
            String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
            _builder_2.append(_firstUpper_1, "");
            smethod.setName(_builder_2.toString());
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("void");
            smethod.setReturnType(_builder_3.toString());
            OParameter sparameter = OopFactoryImpl.eINSTANCE.createOParameter();
            String _name_3 = d.getName();
            String _firstLower = StringExtensions.toFirstLower(_name_3);
            sparameter.setName(_firstLower);
            String _oFeatureType_1 = this.oFeatureType(d, true);
            sparameter.setType(_oFeatureType_1);
            EList<OParameter> _parameters = smethod.getParameters();
            _parameters.add(sparameter);
            OStatement _createOStatement = OopFactoryImpl.eINSTANCE.createOStatement();
            statement = _createOStatement;
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("this.");
            String _name_4 = d.getName();
            _builder_4.append(_name_4, "");
            _builder_4.append(" = ");
            String _name_5 = sparameter.getName();
            _builder_4.append(_name_5, "");
            _builder_4.append(";");
            statement.setContent(_builder_4.toString());
            EList<OStatement> _statements_1 = smethod.getStatements();
            _statements_1.add(statement);
            EList<OMethod> _methods_1 = oc.getMethods();
            _methods_1.add(smethod);
          }
        }
        EList<OFeature> _features_1 = oc.getFeatures();
        final Function1<OFeature, Boolean> _function_4 = new Function1<OFeature, Boolean>() {
          public Boolean apply(final OFeature of) {
            return Boolean.valueOf((of instanceof OReference));
          }
        };
        Iterable<OFeature> _filter_1 = IterableExtensions.<OFeature>filter(_features_1, _function_4);
        for (final OFeature of_1 : _filter_1) {
          {
            OReference f = ((OReference) of_1);
            OMethod gmethod = OopFactoryImpl.eINSTANCE.createOMethod();
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("get");
            String _name = f.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name);
            _builder.append(_firstUpper, "");
            gmethod.setName(_builder.toString());
            if ((f instanceof MultiOReference)) {
              boolean _isUniqueInstance_1 = ((MultiOReference)f).isUniqueInstance();
              if (_isUniqueInstance_1) {
                String _oFeatureType = this.oFeatureType(f, true);
                gmethod.setReturnType(_oFeatureType);
              } else {
                String _oFeatureType_1 = this.oFeatureType(f, true);
                gmethod.setReturnType(_oFeatureType_1);
              }
            } else {
              String _oFeatureType_2 = this.oFeatureType(f, true);
              gmethod.setReturnType(_oFeatureType_2);
            }
            OStatement statement = OopFactoryImpl.eINSTANCE.createOStatement();
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("return this.");
            String _name_1 = f.getName();
            _builder_1.append(_name_1, "");
            _builder_1.append(";");
            statement.setContent(_builder_1.toString());
            EList<OStatement> _statements = gmethod.getStatements();
            _statements.add(statement);
            EList<OMethod> _methods = oc.getMethods();
            _methods.add(gmethod);
            OMethod smethod = OopFactoryImpl.eINSTANCE.createOMethod();
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("set");
            String _name_2 = f.getName();
            String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
            _builder_2.append(_firstUpper_1, "");
            smethod.setName(_builder_2.toString());
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("void");
            smethod.setReturnType(_builder_3.toString());
            OParameter sparameter = OopFactoryImpl.eINSTANCE.createOParameter();
            String _name_3 = f.getName();
            String _firstLower = StringExtensions.toFirstLower(_name_3);
            sparameter.setName(_firstLower);
            if ((f instanceof MultiOReference)) {
              boolean _isUniqueInstance_2 = ((MultiOReference)f).isUniqueInstance();
              if (_isUniqueInstance_2) {
                String _oFeatureType_3 = this.oFeatureType(f, false);
                sparameter.setType(_oFeatureType_3);
              } else {
                String _oFeatureType_4 = this.oFeatureType(f, false);
                sparameter.setType(_oFeatureType_4);
              }
            } else {
              String _oFeatureType_5 = this.oFeatureType(f, false);
              sparameter.setType(_oFeatureType_5);
            }
            EList<OParameter> _parameters = smethod.getParameters();
            _parameters.add(sparameter);
            OStatement _createOStatement = OopFactoryImpl.eINSTANCE.createOStatement();
            statement = _createOStatement;
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("this.");
            String _name_4 = f.getName();
            _builder_4.append(_name_4, "");
            _builder_4.append(" = ");
            String _name_5 = sparameter.getName();
            _builder_4.append(_name_5, "");
            _builder_4.append(";");
            statement.setContent(_builder_4.toString());
            EList<OStatement> _statements_1 = smethod.getStatements();
            _statements_1.add(statement);
            EList<OMethod> _methods_1 = oc.getMethods();
            _methods_1.add(smethod);
          }
        }
      }
    }
    Set<Map.Entry<EObject, EObject>> _entrySet_6 = oClasses.entrySet();
    for (final Map.Entry<EObject, EObject> e_6 : _entrySet_6) {
      {
        EObject _key_6 = e_6.getKey();
        OClass oc = ((OClass) _key_6);
        EList<OFeature> _features = oc.getFeatures();
        final Function1<OFeature, Boolean> _function_3 = new Function1<OFeature, Boolean>() {
          public Boolean apply(final OFeature of) {
            boolean _and = false;
            if (!(of instanceof MultiOReference)) {
              _and = false;
            } else {
              boolean _isUniqueInstance = ((MultiOReference) of).isUniqueInstance();
              _and = _isUniqueInstance;
            }
            return Boolean.valueOf(_and);
          }
        };
        Iterable<OFeature> _filter = IterableExtensions.<OFeature>filter(_features, _function_3);
        for (final OFeature of : _filter) {
          {
            MultiOReference ref = ((MultiOReference) of);
            OMethod cmethod = OopFactoryImpl.eINSTANCE.createOMethod();
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("compareTo");
            cmethod.setName(_builder.toString());
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("int");
            cmethod.setReturnType(_builder_1.toString());
            cmethod.setOverride(true);
            OParameter sparameter = OopFactoryImpl.eINSTANCE.createOParameter();
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("o");
            sparameter.setName(_builder_2.toString());
            String _oFeatureType = this.oFeatureType(ref, true);
            sparameter.setType(_oFeatureType);
            EList<OParameter> _parameters = cmethod.getParameters();
            _parameters.add(sparameter);
            OStatement statement = OopFactoryImpl.eINSTANCE.createOStatement();
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("final int BEFORE = -1;");
            _builder_3.newLine();
            _builder_3.append("final int EQUAL = 0;");
            _builder_3.newLine();
            _builder_3.append("final int AFTER = 1;");
            _builder_3.newLine();
            _builder_3.newLine();
            _builder_3.append("int comparison;");
            _builder_3.newLine();
            _builder_3.newLine();
            _builder_3.append("if (this == o) return EQUAL;\t\t\t");
            _builder_3.newLine();
            {
              OClass _reference_1 = ref.getReference();
              EList<OFeature> _features_1 = _reference_1.getFeatures();
              for(final OFeature f : _features_1) {
                {
                  if ((f instanceof ODataType)) {
                    {
                      String _type = ((ODataType)f).getType();
                      String _literal = DataTypes.STRING.getLiteral();
                      boolean _equals = _type.equals(_literal);
                      if (_equals) {
                        _builder_3.append("//Strings follow this form");
                        _builder_3.newLine();
                        _builder_3.append("comparison = this.get");
                        String _name = ((ODataType)f).getName();
                        String _firstUpper = StringExtensions.toFirstUpper(_name);
                        _builder_3.append(_firstUpper, "");
                        _builder_3.append("().compareTo(o.get");
                        String _name_1 = ((ODataType)f).getName();
                        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
                        _builder_3.append(_firstUpper_1, "");
                        _builder_3.append("());");
                        _builder_3.newLineIfNotEmpty();
                        _builder_3.append("if (comparison != EQUAL) return comparison;");
                        _builder_3.newLine();
                      } else {
                        String _type_1 = ((ODataType)f).getType();
                        String _literal_1 = DataTypes.BOOLEAN.getLiteral();
                        boolean _equals_1 = _type_1.equals(_literal_1);
                        if (_equals_1) {
                          _builder_3.append("//booleans follow this form");
                          _builder_3.newLine();
                          _builder_3.append("if (!this.get");
                          String _name_2 = ((ODataType)f).getName();
                          String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
                          _builder_3.append(_firstUpper_2, "");
                          _builder_3.append("() && o.get");
                          String _name_3 = ((ODataType)f).getName();
                          String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
                          _builder_3.append(_firstUpper_3, "");
                          _builder_3.append("()) return BEFORE;");
                          _builder_3.newLineIfNotEmpty();
                          _builder_3.append("if (this.get");
                          String _name_4 = ((ODataType)f).getName();
                          String _firstUpper_4 = StringExtensions.toFirstUpper(_name_4);
                          _builder_3.append(_firstUpper_4, "");
                          _builder_3.append("() && !o.get");
                          String _name_5 = ((ODataType)f).getName();
                          String _firstUpper_5 = StringExtensions.toFirstUpper(_name_5);
                          _builder_3.append(_firstUpper_5, "");
                          _builder_3.append("()) return AFTER;");
                          _builder_3.newLineIfNotEmpty();
                        } else {
                          String _type_2 = ((ODataType)f).getType();
                          String _literal_2 = DataTypes.DOUBLE.getLiteral();
                          boolean _equals_2 = _type_2.equals(_literal_2);
                          if (_equals_2) {
                            _builder_3.append("//primitive numbers follow this form");
                            _builder_3.newLine();
                            _builder_3.append("if (this.get");
                            String _name_6 = ((ODataType)f).getName();
                            String _firstUpper_6 = StringExtensions.toFirstUpper(_name_6);
                            _builder_3.append(_firstUpper_6, "");
                            _builder_3.append("() < o.get");
                            String _name_7 = ((ODataType)f).getName();
                            String _firstUpper_7 = StringExtensions.toFirstUpper(_name_7);
                            _builder_3.append(_firstUpper_7, "");
                            _builder_3.append("()) return BEFORE;");
                            _builder_3.newLineIfNotEmpty();
                            _builder_3.append("if (this.get");
                            String _name_8 = ((ODataType)f).getName();
                            String _firstUpper_8 = StringExtensions.toFirstUpper(_name_8);
                            _builder_3.append(_firstUpper_8, "");
                            _builder_3.append("() > o.get");
                            String _name_9 = ((ODataType)f).getName();
                            String _firstUpper_9 = StringExtensions.toFirstUpper(_name_9);
                            _builder_3.append(_firstUpper_9, "");
                            _builder_3.append("()) return AFTER;");
                            _builder_3.newLineIfNotEmpty();
                          } else {
                            String _type_3 = ((ODataType)f).getType();
                            String _literal_3 = DataTypes.INTEGER.getLiteral();
                            boolean _equals_3 = _type_3.equals(_literal_3);
                            if (_equals_3) {
                              _builder_3.append("//primitive numbers follow this form");
                              _builder_3.newLine();
                              _builder_3.append("if (this.get");
                              String _name_10 = ((ODataType)f).getName();
                              String _firstUpper_10 = StringExtensions.toFirstUpper(_name_10);
                              _builder_3.append(_firstUpper_10, "");
                              _builder_3.append("() < o.get");
                              String _name_11 = ((ODataType)f).getName();
                              String _firstUpper_11 = StringExtensions.toFirstUpper(_name_11);
                              _builder_3.append(_firstUpper_11, "");
                              _builder_3.append("()) return BEFORE;");
                              _builder_3.newLineIfNotEmpty();
                              _builder_3.append("if (this.get");
                              String _name_12 = ((ODataType)f).getName();
                              String _firstUpper_12 = StringExtensions.toFirstUpper(_name_12);
                              _builder_3.append(_firstUpper_12, "");
                              _builder_3.append("() > o.get");
                              String _name_13 = ((ODataType)f).getName();
                              String _firstUpper_13 = StringExtensions.toFirstUpper(_name_13);
                              _builder_3.append(_firstUpper_13, "");
                              _builder_3.append("()) return AFTER;");
                              _builder_3.newLineIfNotEmpty();
                            } else {
                              String _type_4 = ((ODataType)f).getType();
                              String _literal_4 = DataTypes.LONG.getLiteral();
                              boolean _equals_4 = _type_4.equals(_literal_4);
                              if (_equals_4) {
                                _builder_3.append("//primitive numbers follow this form");
                                _builder_3.newLine();
                                _builder_3.append("if (this.get");
                                String _name_14 = ((ODataType)f).getName();
                                String _firstUpper_14 = StringExtensions.toFirstUpper(_name_14);
                                _builder_3.append(_firstUpper_14, "");
                                _builder_3.append("() < o.get");
                                String _name_15 = ((ODataType)f).getName();
                                String _firstUpper_15 = StringExtensions.toFirstUpper(_name_15);
                                _builder_3.append(_firstUpper_15, "");
                                _builder_3.append("()) return BEFORE;");
                                _builder_3.newLineIfNotEmpty();
                                _builder_3.append("if (this.get");
                                String _name_16 = ((ODataType)f).getName();
                                String _firstUpper_16 = StringExtensions.toFirstUpper(_name_16);
                                _builder_3.append(_firstUpper_16, "");
                                _builder_3.append("() > o.get");
                                String _name_17 = ((ODataType)f).getName();
                                String _firstUpper_17 = StringExtensions.toFirstUpper(_name_17);
                                _builder_3.append(_firstUpper_17, "");
                                _builder_3.append("()) return AFTER;");
                                _builder_3.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            _builder_3.append("\t\t\t\t");
            _builder_3.newLine();
            _builder_3.append("return EQUAL;");
            _builder_3.newLine();
            statement.setContent(_builder_3.toString());
            EList<OStatement> _statements = cmethod.getStatements();
            _statements.add(statement);
            OClass _reference_2 = ref.getReference();
            EList<OMethod> _methods = _reference_2.getMethods();
            _methods.add(cmethod);
          }
        }
      }
    }
    OPackage builderPackage = OopFactoryImpl.eINSTANCE.createOPackage();
    EList<OPackage> _packages = model.getPackages();
    OPackage _get_3 = _packages.get(0);
    String _name = _get_3.getName();
    String _plus = (_name + ".");
    String _plus_1 = (_plus + "builder");
    builderPackage.setName(_plus_1);
    EList<OPackage> _packages_1 = model.getPackages();
    _packages_1.add(builderPackage);
    Set<Map.Entry<EObject, EObject>> _entrySet_7 = oClasses.entrySet();
    for (final Map.Entry<EObject, EObject> e_7 : _entrySet_7) {
      {
        EObject _key_6 = e_7.getKey();
        OClass oc = ((OClass) _key_6);
        OClass bc = OopFactoryImpl.eINSTANCE.createOClass();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Nested");
        String _name_1 = oc.getName();
        _builder.append(_name_1, "");
        _builder.append("Builder");
        bc.setName(_builder.toString());
        Titan2OopGenerator.modelBuilderReleations.put(bc, oc);
        EList<OClass> _classes = builderPackage.getClasses();
        _classes.add(bc);
      }
    }
    Set<Map.Entry<EObject, EObject>> _entrySet_8 = Titan2OopGenerator.modelBuilderReleations.entrySet();
    for (final Map.Entry<EObject, EObject> e_8 : _entrySet_8) {
      {
        EObject _key_6 = e_8.getKey();
        OClass builderOc = ((OClass) _key_6);
        EObject _value_6 = e_8.getValue();
        OClass modelOc = ((OClass) _value_6);
        HashSet<String> importSet = CollectionLiterals.<String>newHashSet();
        StringConcatenation _builder = new StringConcatenation();
        String _oClassPackageName = this.oClassPackageName(modelOc);
        _builder.append(_oClassPackageName, "");
        _builder.append(".");
        String _name_1 = modelOc.getName();
        _builder.append(_name_1, "");
        importSet.add(_builder.toString());
        EList<OFeature> _features = modelOc.getFeatures();
        for (final OFeature f : _features) {
          if ((f instanceof OReference)) {
            StringConcatenation _builder_1 = new StringConcatenation();
            OClass _reference_1 = ((OReference)f).getReference();
            String _oClassPackageName_1 = this.oClassPackageName(_reference_1);
            _builder_1.append(_oClassPackageName_1, "");
            _builder_1.append(".");
            OClass _reference_2 = ((OReference)f).getReference();
            String _name_2 = _reference_2.getName();
            _builder_1.append(_name_2, "");
            importSet.add(_builder_1.toString());
            if ((f instanceof SingleOReference)) {
              final Function2<EObject, EObject, Boolean> _function_3 = new Function2<EObject, EObject, Boolean>() {
                public Boolean apply(final EObject p1, final EObject p2) {
                  OClass _reference = ((SingleOReference)f).getReference();
                  return Boolean.valueOf(p2.equals(_reference));
                }
              };
              Map<EObject, EObject> _filter = MapExtensions.<EObject, EObject>filter(Titan2OopGenerator.modelBuilderReleations, _function_3);
              Set<Map.Entry<EObject, EObject>> _entrySet_9 = _filter.entrySet();
              Map.Entry<EObject, EObject> _get_4 = ((Map.Entry<EObject, EObject>[])Conversions.unwrapArray(_entrySet_9, Map.Entry.class))[0];
              EObject _key_7 = _get_4.getKey();
              OClass builderOfReferenceOclass = ((OClass) _key_7);
              StringConcatenation _builder_2 = new StringConcatenation();
              String _oClassPackageName_2 = this.oClassPackageName(builderOfReferenceOclass);
              _builder_2.append(_oClassPackageName_2, "");
              _builder_2.append(".");
              String _name_3 = builderOfReferenceOclass.getName();
              _builder_2.append(_name_3, "");
              importSet.add(_builder_2.toString());
            } else {
              if ((f instanceof MultiOReference)) {
                StringConcatenation _builder_3 = new StringConcatenation();
                _builder_3.append("java.util.Arrays");
                importSet.add(_builder_3.toString());
                StringConcatenation _builder_4 = new StringConcatenation();
                _builder_4.append("java.util.List");
                importSet.add(_builder_4.toString());
              }
            }
          }
        }
        EList<String> _imports_4 = builderOc.getImports();
        _imports_4.addAll(importSet);
      }
    }
    Set<Map.Entry<EObject, EObject>> _entrySet_9 = Titan2OopGenerator.modelBuilderReleations.entrySet();
    for (final Map.Entry<EObject, EObject> e_9 : _entrySet_9) {
      {
        EObject _key_6 = e_9.getKey();
        OClass builderOc = ((OClass) _key_6);
        EObject _value_6 = e_9.getValue();
        OClass modelOc = ((OClass) _value_6);
        OMethod constructor = OopFactoryImpl.eINSTANCE.createOMethod();
        String _name_1 = modelOc.getName();
        constructor.setName(_name_1);
        constructor.setStatic(true);
        StringConcatenation _builder = new StringConcatenation();
        String _name_2 = modelOc.getName();
        _builder.append(_name_2, "");
        constructor.setReturnType(_builder.toString());
        OStatement statement = OopFactoryImpl.eINSTANCE.createOStatement();
        StringConcatenation _builder_1 = new StringConcatenation();
        String _name_3 = modelOc.getName();
        _builder_1.append(_name_3, "");
        _builder_1.append(" o = new ");
        String _name_4 = modelOc.getName();
        _builder_1.append(_name_4, "");
        _builder_1.append("();");
        String statementContent = _builder_1.toString();
        EList<OFeature> oFeatures = modelOc.getFeatures();
        for (final OFeature of : oFeatures) {
          {
            boolean _and = false;
            if (!(of instanceof MultiOReference)) {
              _and = false;
            } else {
              boolean _contains_2 = Titan2OopGenerator.oppositedOMultiReferences.contains(of);
              boolean _not_2 = (!_contains_2);
              _and = _not_2;
            }
            if (_and) {
              String _statementContent = statementContent;
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("for (");
              OClass _reference_1 = ((OReference) of).getReference();
              String _name_5 = _reference_1.getName();
              _builder_2.append(_name_5, "");
              _builder_2.append(" r : ");
              String _name_6 = of.getName();
              _builder_2.append(_name_6, "");
              _builder_2.append(") {");
              _builder_2.newLineIfNotEmpty();
              _builder_2.append("\t");
              _builder_2.append("o.add");
              OClass _reference_2 = ((OReference) of).getReference();
              String _name_7 = _reference_2.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name_7);
              _builder_2.append(_firstUpper, "\t");
              _builder_2.append("(r);");
              _builder_2.newLineIfNotEmpty();
              {
                OClass _reference_3 = ((OReference) of).getReference();
                EList<OFeature> _features = _reference_3.getFeatures();
                for(final OFeature f2 : _features) {
                  {
                    boolean _and_1 = false;
                    if (!(f2 instanceof OReference)) {
                      _and_1 = false;
                    } else {
                      MultiOReference _opposite_2 = ((OReference) f2).getOpposite();
                      boolean _notEquals = (!Objects.equal(_opposite_2, null));
                      _and_1 = _notEquals;
                    }
                    if (_and_1) {
                      {
                        EList<OFeature> _features_1 = modelOc.getFeatures();
                        for(final OFeature f3 : _features_1) {
                          {
                            boolean _and_2 = false;
                            if (!(f3 instanceof OReference)) {
                              _and_2 = false;
                            } else {
                              OClass _reference_4 = ((OReference) f3).getReference();
                              EObject _eContainer_1 = ((OReference) f2).eContainer();
                              boolean _equals = _reference_4.equals(((OClass) _eContainer_1));
                              _and_2 = _equals;
                            }
                            if (_and_2) {
                              {
                                if ((f2 instanceof MultiOReference)) {
                                  _builder_2.append("\t");
                                  _builder_2.append("for(");
                                  OClass _reference_5 = ((OReference) f2).getReference();
                                  String _name_8 = _reference_5.getName();
                                  _builder_2.append(_name_8, "\t");
                                  _builder_2.append(" c : r.get");
                                  String _name_9 = ((MultiOReference)f2).getName();
                                  String _firstUpper_1 = StringExtensions.toFirstUpper(_name_9);
                                  _builder_2.append(_firstUpper_1, "\t");
                                  _builder_2.append("()){");
                                  _builder_2.newLineIfNotEmpty();
                                  _builder_2.append("\t");
                                  _builder_2.append("\t");
                                  _builder_2.append("o.add");
                                  OClass _reference_6 = ((MultiOReference)f2).getReference();
                                  String _name_10 = _reference_6.getName();
                                  _builder_2.append(_name_10, "\t\t");
                                  _builder_2.append("(c);");
                                  _builder_2.newLineIfNotEmpty();
                                  _builder_2.append("\t");
                                  _builder_2.append("}");
                                  _builder_2.newLine();
                                } else {
                                  _builder_2.append("\t");
                                  _builder_2.append("o.add");
                                  OClass _reference_7 = ((SingleOReference) f2).getReference();
                                  String _name_11 = _reference_7.getName();
                                  _builder_2.append(_name_11, "\t");
                                  _builder_2.append("(r.get");
                                  String _name_12 = f2.getName();
                                  String _firstUpper_2 = StringExtensions.toFirstUpper(_name_12);
                                  _builder_2.append(_firstUpper_2, "\t");
                                  _builder_2.append("());");
                                  _builder_2.newLineIfNotEmpty();
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              _builder_2.append("}");
              _builder_2.newLine();
              statementContent = (_statementContent + _builder_2);
            } else {
              if ((!(of instanceof MultiOReference))) {
                String _statementContent_1 = statementContent;
                StringConcatenation _builder_3 = new StringConcatenation();
                _builder_3.append("o.set");
                String _name_13 = of.getName();
                String _firstUpper_3 = StringExtensions.toFirstUpper(_name_13);
                _builder_3.append(_firstUpper_3, "");
                _builder_3.append("(");
                String _name_14 = of.getName();
                _builder_3.append(_name_14, "");
                _builder_3.append(");");
                statementContent = (_statementContent_1 + _builder_3);
              }
            }
            if ((of instanceof SingleODataType)) {
              OParameter param = OopFactoryImpl.eINSTANCE.createOParameter();
              String _name_15 = ((SingleODataType)of).getName();
              param.setName(_name_15);
              String _oFeatureType = this.oFeatureType(of, true);
              param.setType(_oFeatureType);
              EList<OParameter> _parameters = constructor.getParameters();
              _parameters.add(param);
            } else {
              if ((of instanceof MultiODataType)) {
                boolean _contains_3 = Titan2OopGenerator.oppositedOMultiReferences.contains(of);
                boolean _not_3 = (!_contains_3);
                if (_not_3) {
                  OParameter param_1 = OopFactoryImpl.eINSTANCE.createOParameter();
                  String _name_16 = ((MultiODataType)of).getName();
                  param_1.setName(_name_16);
                  String _oFeatureType_1 = this.oFeatureType(of, true);
                  param_1.setType(_oFeatureType_1);
                  EList<OParameter> _parameters_1 = constructor.getParameters();
                  _parameters_1.add(param_1);
                }
              } else {
                if ((of instanceof SingleOReference)) {
                  OParameter param_2 = OopFactoryImpl.eINSTANCE.createOParameter();
                  String _name_17 = ((SingleOReference)of).getName();
                  param_2.setName(_name_17);
                  String _oFeatureType_2 = this.oFeatureType(of, true);
                  param_2.setType(_oFeatureType_2);
                  EList<OParameter> _parameters_2 = constructor.getParameters();
                  _parameters_2.add(param_2);
                } else {
                  if ((of instanceof MultiOReference)) {
                    boolean _contains_4 = Titan2OopGenerator.oppositedOMultiReferences.contains(of);
                    boolean _not_4 = (!_contains_4);
                    if (_not_4) {
                      OParameter param_3 = OopFactoryImpl.eINSTANCE.createOParameter();
                      String _name_18 = ((MultiOReference)of).getName();
                      param_3.setName(_name_18);
                      String _oFeatureType_3 = this.oFeatureType(of, true);
                      param_3.setType(_oFeatureType_3);
                      EList<OParameter> _parameters_3 = constructor.getParameters();
                      _parameters_3.add(param_3);
                    }
                  }
                }
              }
            }
          }
        }
        String _statementContent = statementContent;
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("return o;");
        statementContent = (_statementContent + _builder_2);
        statement.setContent(statementContent);
        EList<OStatement> _statements = constructor.getStatements();
        _statements.add(statement);
        EList<OMethod> _methods = builderOc.getMethods();
        _methods.add(constructor);
      }
    }
    Set<Map.Entry<EObject, EObject>> _entrySet_10 = Titan2OopGenerator.modelBuilderReleations.entrySet();
    for (final Map.Entry<EObject, EObject> e_10 : _entrySet_10) {
      {
        EObject _key_6 = e_10.getKey();
        OClass builderOc = ((OClass) _key_6);
        EObject _value_6 = e_10.getValue();
        OClass modelOc = ((OClass) _value_6);
        EList<OFeature> oFeatures = modelOc.getFeatures();
        for (final OFeature of : oFeatures) {
          boolean _and = false;
          if (!((of instanceof MultiOReference) || (of instanceof MultiODataType))) {
            _and = false;
          } else {
            boolean _contains_2 = Titan2OopGenerator.oppositedOMultiReferences.contains(of);
            _and = _contains_2;
          }
          boolean _not_2 = (!_and);
          if (_not_2) {
            OMethod staticOM = OopFactoryImpl.eINSTANCE.createOMethod();
            EList<OMethod> _methods = builderOc.getMethods();
            _methods.add(staticOM);
            staticOM.setStatic(true);
            String _name_1 = of.getName();
            staticOM.setName(_name_1);
            if ((of instanceof SingleODataType)) {
              OParameter param = OopFactoryImpl.eINSTANCE.createOParameter();
              String _name_2 = ((SingleODataType)of).getName();
              param.setName(_name_2);
              String _oFeatureType = this.oFeatureType(of, true);
              param.setType(_oFeatureType);
              EList<OParameter> _parameters = staticOM.getParameters();
              _parameters.add(param);
              OStatement statement = OopFactoryImpl.eINSTANCE.createOStatement();
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("return ");
              String _name_3 = ((SingleODataType)of).getName();
              _builder.append(_name_3, "");
              _builder.append(";");
              statement.setContent(_builder.toString());
              String _oFeatureType_1 = this.oFeatureType(of, true);
              staticOM.setReturnType(_oFeatureType_1);
              EList<OStatement> _statements = staticOM.getStatements();
              _statements.add(statement);
            } else {
              if ((of instanceof MultiODataType)) {
                boolean _contains_3 = Titan2OopGenerator.oppositedOMultiReferences.contains(of);
                boolean _not_3 = (!_contains_3);
                if (_not_3) {
                  OParameter param_1 = OopFactoryImpl.eINSTANCE.createOParameter();
                  String _name_4 = ((MultiODataType)of).getName();
                  param_1.setName(_name_4);
                  String _oFeatureType_2 = this.oFeatureType(of, true);
                  param_1.setType(_oFeatureType_2);
                  EList<OParameter> _parameters_1 = staticOM.getParameters();
                  _parameters_1.add(param_1);
                  OStatement statement_1 = OopFactoryImpl.eINSTANCE.createOStatement();
                  StringConcatenation _builder_1 = new StringConcatenation();
                  _builder_1.append("return ");
                  String _name_5 = ((MultiODataType)of).getName();
                  _builder_1.append(_name_5, "");
                  _builder_1.append(";");
                  statement_1.setContent(_builder_1.toString());
                  String _oFeatureType_3 = this.oFeatureType(of, true);
                  staticOM.setReturnType(_oFeatureType_3);
                  EList<OStatement> _statements_1 = staticOM.getStatements();
                  _statements_1.add(statement_1);
                }
              } else {
                if ((of instanceof SingleOReference)) {
                  OClass ref = ((SingleOReference)of).getReference();
                  EList<OFeature> _features = ref.getFeatures();
                  for (final OFeature refFeatures : _features) {
                    boolean _contains_4 = Titan2OopGenerator.oppositedOMultiReferences.contains(refFeatures);
                    boolean _not_4 = (!_contains_4);
                    if (_not_4) {
                      OParameter param_2 = OopFactoryImpl.eINSTANCE.createOParameter();
                      String _name_6 = refFeatures.getName();
                      param_2.setName(_name_6);
                      if ((refFeatures instanceof SingleODataType)) {
                        String _oFeatureType_4 = this.oFeatureType(refFeatures, true);
                        param_2.setType(_oFeatureType_4);
                      } else {
                        if ((refFeatures instanceof MultiODataType)) {
                          String _oFeatureType_5 = this.oFeatureType(refFeatures, true);
                          param_2.setType(_oFeatureType_5);
                        } else {
                          if ((refFeatures instanceof SingleOReference)) {
                            String _oFeatureType_6 = this.oFeatureType(refFeatures, true);
                            param_2.setType(_oFeatureType_6);
                          } else {
                            if ((refFeatures instanceof MultiOReference)) {
                              String _oFeatureType_7 = this.oFeatureType(refFeatures, true);
                              param_2.setType(_oFeatureType_7);
                            }
                          }
                        }
                      }
                      EList<OParameter> _parameters_2 = staticOM.getParameters();
                      _parameters_2.add(param_2);
                    }
                  }
                  OStatement statement_2 = OopFactoryImpl.eINSTANCE.createOStatement();
                  String statementParamString = "";
                  EList<OParameter> _parameters_3 = staticOM.getParameters();
                  for (final OParameter p : _parameters_3) {
                    String _statementParamString = statementParamString;
                    StringConcatenation _builder_2 = new StringConcatenation();
                    String _name_7 = p.getName();
                    _builder_2.append(_name_7, "");
                    {
                      EList<OParameter> _parameters_4 = staticOM.getParameters();
                      OParameter _last = IterableExtensions.<OParameter>last(_parameters_4);
                      boolean _equals = _last.equals(p);
                      boolean _not_5 = (!_equals);
                      if (_not_5) {
                        _builder_2.append(", ");
                      }
                    }
                    _builder_2.newLineIfNotEmpty();
                    statementParamString = (_statementParamString + _builder_2);
                  }
                  final Function2<EObject, EObject, Boolean> _function_3 = new Function2<EObject, EObject, Boolean>() {
                    public Boolean apply(final EObject p1, final EObject p2) {
                      OClass _reference = ((SingleOReference)of).getReference();
                      return Boolean.valueOf(p2.equals(_reference));
                    }
                  };
                  Map<EObject, EObject> _filter = MapExtensions.<EObject, EObject>filter(Titan2OopGenerator.modelBuilderReleations, _function_3);
                  Set<Map.Entry<EObject, EObject>> _entrySet_11 = _filter.entrySet();
                  Map.Entry<EObject, EObject> _get_4 = ((Map.Entry<EObject, EObject>[])Conversions.unwrapArray(_entrySet_11, Map.Entry.class))[0];
                  EObject _key_7 = _get_4.getKey();
                  OClass builderOfReferenceOclass = ((OClass) _key_7);
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append("return ");
                  String _name_8 = builderOfReferenceOclass.getName();
                  _builder_3.append(_name_8, "");
                  _builder_3.append(".");
                  OClass _reference_1 = ((SingleOReference)of).getReference();
                  String _name_9 = _reference_1.getName();
                  _builder_3.append(_name_9, "");
                  _builder_3.append("(");
                  _builder_3.append(statementParamString, "");
                  _builder_3.append(");");
                  statement_2.setContent(_builder_3.toString());
                  StringConcatenation _builder_4 = new StringConcatenation();
                  OClass _reference_2 = ((SingleOReference)of).getReference();
                  String _name_10 = _reference_2.getName();
                  _builder_4.append(_name_10, "");
                  staticOM.setReturnType(_builder_4.toString());
                  EList<OStatement> _statements_2 = staticOM.getStatements();
                  _statements_2.add(statement_2);
                } else {
                  if ((of instanceof MultiOReference)) {
                    boolean _contains_5 = Titan2OopGenerator.oppositedOMultiReferences.contains(of);
                    boolean _not_6 = (!_contains_5);
                    if (_not_6) {
                      OParameter param_3 = OopFactoryImpl.eINSTANCE.createOParameter();
                      String _name_11 = ((MultiOReference)of).getName();
                      param_3.setName(_name_11);
                      StringConcatenation _builder_5 = new StringConcatenation();
                      OClass _reference_3 = ((MultiOReference)of).getReference();
                      String _name_12 = _reference_3.getName();
                      _builder_5.append(_name_12, "");
                      _builder_5.append("...");
                      param_3.setType(_builder_5.toString());
                      EList<OParameter> _parameters_5 = staticOM.getParameters();
                      _parameters_5.add(param_3);
                      OStatement statement_3 = OopFactoryImpl.eINSTANCE.createOStatement();
                      StringConcatenation _builder_6 = new StringConcatenation();
                      _builder_6.append("return Arrays.asList(");
                      String _name_13 = ((MultiOReference)of).getName();
                      _builder_6.append(_name_13, "");
                      _builder_6.append(");");
                      statement_3.setContent(_builder_6.toString());
                      String _oFeatureType_8 = this.oFeatureType(of, true);
                      staticOM.setReturnType(_oFeatureType_8);
                      EList<OStatement> _statements_3 = staticOM.getStatements();
                      _statements_3.add(statement_3);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    Titan2OopGenerator.modelBuilderReleations.clear();
    Titan2OopGenerator.transformationReleations.clear();
  }
  
  public OFeature generateFeature(final Feature dt) {
    if (dt instanceof MultiDataType) {
      return _generateFeature((MultiDataType)dt);
    } else if (dt instanceof MultiReference) {
      return _generateFeature((MultiReference)dt);
    } else if (dt instanceof SingleDataType) {
      return _generateFeature((SingleDataType)dt);
    } else if (dt instanceof SingleReference) {
      return _generateFeature((SingleReference)dt);
    } else if (dt instanceof DataType) {
      return _generateFeature((DataType)dt);
    } else if (dt instanceof Reference) {
      return _generateFeature((Reference)dt);
    } else if (dt != null) {
      return _generateFeature(dt);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(dt).toString());
    }
  }
}
