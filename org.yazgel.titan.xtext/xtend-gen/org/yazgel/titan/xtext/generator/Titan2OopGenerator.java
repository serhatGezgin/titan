package org.yazgel.titan.xtext.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.yazgel.oop.MultiOFeatureTypes;
import org.yazgel.oop.OClass;
import org.yazgel.oop.OClassImplement;
import org.yazgel.oop.OClassImport;
import org.yazgel.oop.OConstructor;
import org.yazgel.oop.ODataType;
import org.yazgel.oop.ODataTypeMulti;
import org.yazgel.oop.ODataTypeSingle;
import org.yazgel.oop.ODataTypes;
import org.yazgel.oop.OFeature;
import org.yazgel.oop.OMethod;
import org.yazgel.oop.OModel;
import org.yazgel.oop.OPackage;
import org.yazgel.oop.OParameter;
import org.yazgel.oop.OReference;
import org.yazgel.oop.OReferenceMulti;
import org.yazgel.oop.OReferenceSingle;
import org.yazgel.oop.OStatement;
import org.yazgel.oop.impl.OopFactoryImpl;
import org.yazgel.titan.xtext.titan.DataType;
import org.yazgel.titan.xtext.titan.DataTypes;
import org.yazgel.titan.xtext.titan.Entity;
import org.yazgel.titan.xtext.titan.Feature;
import org.yazgel.titan.xtext.titan.Module;
import org.yazgel.titan.xtext.titan.Reference;

@SuppressWarnings("all")
public class Titan2OopGenerator {
  public static Map<EObject, EObject> transformationReleations = new HashMap<EObject, EObject>();
  
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
      OClassImport oClassImport = OopFactoryImpl.eINSTANCE.createOClassImport();
      String _name = entity.getName();
      oClass.setName(_name);
      oClass.setImports(oClassImport);
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
    ODataType _xblockexpression = null;
    {
      ODataType data = null;
      boolean _isMany = dt.isMany();
      if (_isMany) {
        ODataTypeMulti _createODataTypeMulti = OopFactoryImpl.eINSTANCE.createODataTypeMulti();
        data = _createODataTypeMulti;
        ((ODataTypeMulti) data).setMultiType(MultiOFeatureTypes.ARRAY);
      } else {
        ODataTypeSingle _createODataTypeSingle = OopFactoryImpl.eINSTANCE.createODataTypeSingle();
        data = _createODataTypeSingle;
      }
      String _name = dt.getName();
      data.setName(_name);
      Titan2OopGenerator.transformationReleations.put(dt, data);
      Titan2OopGenerator.transformationReleations.put(data, dt);
      DataTypes _type = dt.getType();
      if (_type != null) {
        switch (_type) {
          case BOOLEAN:
            data.setType(ODataTypes.BOOLEAN);
            break;
          case DOUBLE:
            data.setType(ODataTypes.DOUBLE);
            break;
          case INTEGER:
            data.setType(ODataTypes.INTEGER);
            break;
          case LONG:
            data.setType(ODataTypes.LONG);
            break;
          case STRING:
            data.setType(ODataTypes.STRING);
            break;
          default:
            break;
        }
      }
      _xblockexpression = data;
    }
    return _xblockexpression;
  }
  
  protected OReference _generateFeature(final Reference r) {
    OReference _xblockexpression = null;
    {
      OReference ref = null;
      boolean _isMany = r.isMany();
      if (_isMany) {
        OReferenceMulti _createOReferenceMulti = OopFactoryImpl.eINSTANCE.createOReferenceMulti();
        ref = _createOReferenceMulti;
        ((OReferenceMulti) ref).setMultiType(MultiOFeatureTypes.ARRAY_LIST);
      } else {
        OReferenceSingle _createOReferenceSingle = OopFactoryImpl.eINSTANCE.createOReferenceSingle();
        ref = _createOReferenceSingle;
      }
      String _name = r.getName();
      ref.setName(_name);
      Titan2OopGenerator.transformationReleations.put(r, ref);
      Titan2OopGenerator.transformationReleations.put(ref, r);
      _xblockexpression = ref;
    }
    return _xblockexpression;
  }
  
  public void postGenerator(final OModel model) {
    final Function2<EObject, EObject, Boolean> _function = new Function2<EObject, EObject, Boolean>() {
      public Boolean apply(final EObject p1, final EObject p2) {
        return Boolean.valueOf((p1 instanceof Reference));
      }
    };
    Map<EObject, EObject> releationsOfReferences = MapExtensions.<EObject, EObject>filter(Titan2OopGenerator.transformationReleations, _function);
    Set<Map.Entry<EObject, EObject>> _entrySet = releationsOfReferences.entrySet();
    for (final Map.Entry<EObject, EObject> e : _entrySet) {
      {
        EObject _key = e.getKey();
        Entity _reference = ((Reference) _key).getReference();
        EObject _get = Titan2OopGenerator.transformationReleations.get(_reference);
        OClass or = ((OClass) _get);
        EObject _value = e.getValue();
        ((OReference) _value).setReference(or);
      }
    }
    final Function2<EObject, EObject, Boolean> _function_1 = new Function2<EObject, EObject, Boolean>() {
      public Boolean apply(final EObject p1, final EObject p2) {
        boolean _and = false;
        boolean _and_1 = false;
        if (!(p1 instanceof Reference)) {
          _and_1 = false;
        } else {
          Reference _opposite = ((Reference) p1).getOpposite();
          boolean _notEquals = (!Objects.equal(_opposite, null));
          _and_1 = _notEquals;
        }
        if (!_and_1) {
          _and = false;
        } else {
          Reference _opposite_1 = ((Reference) p1).getOpposite();
          boolean _isMany = _opposite_1.isMany();
          _and = _isMany;
        }
        return Boolean.valueOf(_and);
      }
    };
    Map<EObject, EObject> oppositeReferences = MapExtensions.<EObject, EObject>filter(Titan2OopGenerator.transformationReleations, _function_1);
    Set<Map.Entry<EObject, EObject>> _entrySet_1 = oppositeReferences.entrySet();
    for (final Map.Entry<EObject, EObject> e_1 : _entrySet_1) {
      {
        EObject _key = e_1.getKey();
        Reference _opposite = ((Reference) _key).getOpposite();
        EObject _get = Titan2OopGenerator.transformationReleations.get(_opposite);
        OReferenceMulti or = ((OReferenceMulti) _get);
        or.setUniqueInstance(true);
        or.setMultiType(MultiOFeatureTypes.TREE_SET);
      }
    }
    Set<Map.Entry<EObject, EObject>> _entrySet_2 = releationsOfReferences.entrySet();
    for (final Map.Entry<EObject, EObject> e_2 : _entrySet_2) {
      {
        EObject _key = e_2.getKey();
        Reference reference = ((Reference) _key);
        EObject _value = e_2.getValue();
        OReference oReference = ((OReference) _value);
        EObject _value_1 = e_2.getValue();
        EObject _eContainer = _value_1.eContainer();
        OClass oClass = ((OClass) _eContainer);
        OClassImport _imports = oClass.getImports();
        EList<OClass> _importsFromDomain = _imports.getImportsFromDomain();
        Entity _reference = reference.getReference();
        EObject _get = Titan2OopGenerator.transformationReleations.get(_reference);
        _importsFromDomain.add(((OClass) _get));
        if ((oReference instanceof OReferenceMulti)) {
          boolean _isUniqueInstance = ((OReferenceMulti) oReference).isUniqueInstance();
          if (_isUniqueInstance) {
            OClassImport _imports_1 = oClass.getImports();
            EList<String> _imports_2 = _imports_1.getImports();
            _imports_2.add("java.util.Set");
            OClassImport _imports_3 = oClass.getImports();
            EList<String> _imports_4 = _imports_3.getImports();
            _imports_4.add("java.util.TreeSet");
          } else {
            OClassImport _imports_5 = oClass.getImports();
            EList<String> _imports_6 = _imports_5.getImports();
            _imports_6.add("java.util.List");
            OClassImport _imports_7 = oClass.getImports();
            EList<String> _imports_8 = _imports_7.getImports();
            _imports_8.add("java.util.ArrayList");
          }
        }
      }
    }
    final Function2<EObject, EObject, Boolean> _function_2 = new Function2<EObject, EObject, Boolean>() {
      public Boolean apply(final EObject p1, final EObject p2) {
        boolean _and = false;
        if (!(p1 instanceof OClass)) {
          _and = false;
        } else {
          EList<OFeature> _features = ((OClass) p1).getFeatures();
          final Function1<OFeature, Boolean> _function = new Function1<OFeature, Boolean>() {
            public Boolean apply(final OFeature f) {
              boolean _and = false;
              if (!(f instanceof OReferenceMulti)) {
                _and = false;
              } else {
                boolean _isUniqueInstance = ((OReferenceMulti) f).isUniqueInstance();
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
    Map<EObject, EObject> oClasesWithUniqueInstanceOFeatures = MapExtensions.<EObject, EObject>filter(Titan2OopGenerator.transformationReleations, _function_2);
    Set<Map.Entry<EObject, EObject>> _entrySet_3 = oClasesWithUniqueInstanceOFeatures.entrySet();
    for (final Map.Entry<EObject, EObject> e_3 : _entrySet_3) {
      {
        EObject _key = e_3.getKey();
        OClass oClass = ((OClass) _key);
        OClassImplement _implements = oClass.getImplements();
        EList<String> _implementsString = _implements.getImplementsString();
        _implementsString.add("Comparable");
      }
    }
    final Function2<EObject, EObject, Boolean> _function_3 = new Function2<EObject, EObject, Boolean>() {
      public Boolean apply(final EObject p1, final EObject p2) {
        return Boolean.valueOf((p1 instanceof OClass));
      }
    };
    Map<EObject, EObject> oClasses = MapExtensions.<EObject, EObject>filter(Titan2OopGenerator.transformationReleations, _function_3);
    Set<Map.Entry<EObject, EObject>> _entrySet_4 = oClasses.entrySet();
    for (final Map.Entry<EObject, EObject> e_4 : _entrySet_4) {
      {
        EObject _key = e_4.getKey();
        OClass oc = ((OClass) _key);
        OConstructor oConst = OopFactoryImpl.eINSTANCE.createOConstructor();
        String _name = oc.getName();
        oConst.setName(_name);
        EList<OFeature> oFeatures = oc.getFeatures();
        for (final OFeature of : oFeatures) {
          {
            OStatement statement = OopFactoryImpl.eINSTANCE.createOStatement();
            if ((of instanceof OReferenceMulti)) {
              boolean _isUniqueInstance = ((OReferenceMulti)of).isUniqueInstance();
              if (_isUniqueInstance) {
                StringConcatenation _builder = new StringConcatenation();
                String _name_1 = ((OReferenceMulti)of).getName();
                _builder.append(_name_1, "");
                _builder.append(" = new TreeSet<>();");
                statement.setContent(_builder.toString());
              } else {
                StringConcatenation _builder_1 = new StringConcatenation();
                String _name_2 = ((OReferenceMulti)of).getName();
                _builder_1.append(_name_2, "");
                _builder_1.append(" = new ArrayList<>();");
                statement.setContent(_builder_1.toString());
              }
            } else {
              if ((of instanceof OReferenceSingle)) {
                StringConcatenation _builder_2 = new StringConcatenation();
                String _name_3 = ((OReferenceSingle)of).getName();
                _builder_2.append(_name_3, "");
                _builder_2.append(" = new ");
                OClass _reference = ((OReference) of).getReference();
                String _name_4 = _reference.getName();
                _builder_2.append(_name_4, "");
                _builder_2.append("();");
                statement.setContent(_builder_2.toString());
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
    Set<Map.Entry<EObject, EObject>> _entrySet_5 = oClasses.entrySet();
    for (final Map.Entry<EObject, EObject> e_5 : _entrySet_5) {
      {
        EObject _key = e_5.getKey();
        OClass oc = ((OClass) _key);
        OConstructor oConst = OopFactoryImpl.eINSTANCE.createOConstructor();
        String _name = oc.getName();
        oConst.setName(_name);
        EList<OFeature> oFeatures = oc.getFeatures();
        for (final OFeature of : oFeatures) {
          {
            OStatement statement = OopFactoryImpl.eINSTANCE.createOStatement();
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("this.");
            String _name_1 = of.getName();
            _builder.append(_name_1, "");
            _builder.append(" = ");
            String _name_2 = of.getName();
            _builder.append(_name_2, "");
            _builder.append(";");
            statement.setContent(_builder.toString());
            EList<OStatement> _statements = oConst.getStatements();
            _statements.add(statement);
            OParameter param = OopFactoryImpl.eINSTANCE.createOParameter();
            String _name_3 = of.getName();
            param.setName(_name_3);
            if ((of instanceof ODataTypeSingle)) {
              StringConcatenation _builder_1 = new StringConcatenation();
              ODataTypes _type = ((ODataTypeSingle)of).getType();
              _builder_1.append(_type, "");
              param.setType(_builder_1.toString());
            } else {
              if ((of instanceof ODataTypeMulti)) {
                StringConcatenation _builder_2 = new StringConcatenation();
                ODataTypes _type_1 = ((ODataTypeMulti)of).getType();
                _builder_2.append(_type_1, "");
                _builder_2.append("[]");
                param.setType(_builder_2.toString());
              } else {
                if ((of instanceof OReferenceSingle)) {
                  StringConcatenation _builder_3 = new StringConcatenation();
                  OClass _reference = ((OReferenceSingle)of).getReference();
                  String _name_4 = _reference.getName();
                  _builder_3.append(_name_4, "");
                  param.setType(_builder_3.toString());
                } else {
                  if ((of instanceof OReferenceMulti)) {
                    boolean _isUniqueInstance = ((OReferenceMulti)of).isUniqueInstance();
                    if (_isUniqueInstance) {
                      StringConcatenation _builder_4 = new StringConcatenation();
                      _builder_4.append("TreeSet<");
                      OClass _reference_1 = ((OReferenceMulti)of).getReference();
                      String _name_5 = _reference_1.getName();
                      _builder_4.append(_name_5, "");
                      _builder_4.append(">");
                      param.setType(_builder_4.toString());
                    } else {
                      StringConcatenation _builder_5 = new StringConcatenation();
                      _builder_5.append("List<");
                      OClass _reference_2 = ((OReferenceMulti)of).getReference();
                      String _name_6 = _reference_2.getName();
                      _builder_5.append(_name_6, "");
                      _builder_5.append(">");
                      param.setType(_builder_5.toString());
                    }
                  }
                }
              }
            }
            EList<OParameter> _parameters = oConst.getParameters();
            _parameters.add(param);
          }
        }
        EList<OMethod> _methods = oc.getMethods();
        _methods.add(oConst);
      }
    }
    Set<Map.Entry<EObject, EObject>> _entrySet_6 = oClasses.entrySet();
    for (final Map.Entry<EObject, EObject> e_6 : _entrySet_6) {
      {
        ArrayList<Object> list = CollectionLiterals.<Object>newArrayList();
        EObject _key = e_6.getKey();
        OClass oc = ((OClass) _key);
        EList<OFeature> _features = oc.getFeatures();
        final Function1<OFeature, Boolean> _function_4 = new Function1<OFeature, Boolean>() {
          public Boolean apply(final OFeature of) {
            return Boolean.valueOf((of instanceof OReferenceMulti));
          }
        };
        Iterable<OFeature> _filter = IterableExtensions.<OFeature>filter(_features, _function_4);
        for (final OFeature of : _filter) {
          {
            OReferenceMulti f = ((OReferenceMulti) of);
            OClass _reference = f.getReference();
            boolean _contains = list.contains(_reference);
            boolean _not = (!_contains);
            if (_not) {
              OMethod method = OopFactoryImpl.eINSTANCE.createOMethod();
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("add");
              OClass _reference_1 = f.getReference();
              String _name = _reference_1.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name);
              _builder.append(_firstUpper, "");
              method.setName(_builder.toString());
              method.setReturnType("void");
              OParameter parameter = OopFactoryImpl.eINSTANCE.createOParameter();
              OClass _reference_2 = f.getReference();
              String _name_1 = _reference_2.getName();
              String _firstLower = StringExtensions.toFirstLower(_name_1);
              parameter.setName(_firstLower);
              OClass _reference_3 = f.getReference();
              String _name_2 = _reference_3.getName();
              parameter.setType(_name_2);
              EList<OParameter> _parameters = method.getParameters();
              _parameters.add(parameter);
              OStatement statement = OopFactoryImpl.eINSTANCE.createOStatement();
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("get");
              String _name_3 = f.getName();
              String _firstUpper_1 = StringExtensions.toFirstUpper(_name_3);
              _builder_1.append(_firstUpper_1, "");
              _builder_1.append("().add(");
              String _name_4 = parameter.getName();
              _builder_1.append(_name_4, "");
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
        final Function1<OFeature, Boolean> _function_5 = new Function1<OFeature, Boolean>() {
          public Boolean apply(final OFeature odt) {
            return Boolean.valueOf((odt instanceof ODataTypeMulti));
          }
        };
        Iterable<OFeature> _filter_1 = IterableExtensions.<OFeature>filter(_features_1, _function_5);
        for (final OFeature odt : _filter_1) {
          {
            ODataTypeMulti dt = ((ODataTypeMulti) odt);
            ODataTypes _type = dt.getType();
            boolean _contains = list.contains(_type);
            boolean _not = (!_contains);
            if (_not) {
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
              ODataTypes _type_1 = dt.getType();
              String _literal = _type_1.getLiteral();
              parameter.setType(_literal);
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
              ODataTypes _type_2 = dt.getType();
              list.add(_type_2);
            }
          }
        }
      }
    }
    Set<Map.Entry<EObject, EObject>> _entrySet_7 = oClasses.entrySet();
    for (final Map.Entry<EObject, EObject> e_7 : _entrySet_7) {
      {
        EObject _key = e_7.getKey();
        OClass oc = ((OClass) _key);
        EList<OFeature> _features = oc.getFeatures();
        final Function1<OFeature, Boolean> _function_4 = new Function1<OFeature, Boolean>() {
          public Boolean apply(final OFeature of) {
            return Boolean.valueOf((of instanceof ODataType));
          }
        };
        Iterable<OFeature> _filter = IterableExtensions.<OFeature>filter(_features, _function_4);
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
            StringConcatenation _builder_1 = new StringConcatenation();
            ODataTypes _type = d.getType();
            String _literal = _type.getLiteral();
            _builder_1.append(_literal, "");
            {
              if ((d instanceof ODataTypeMulti)) {
                _builder_1.append("[]");
              }
            }
            gmethod.setReturnType(_builder_1.toString());
            OStatement statement = OopFactoryImpl.eINSTANCE.createOStatement();
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("return this.");
            String _name_1 = d.getName();
            _builder_2.append(_name_1, "");
            _builder_2.append(";");
            statement.setContent(_builder_2.toString());
            EList<OStatement> _statements = gmethod.getStatements();
            _statements.add(statement);
            EList<OMethod> _methods = oc.getMethods();
            _methods.add(gmethod);
            OMethod smethod = OopFactoryImpl.eINSTANCE.createOMethod();
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("set");
            String _name_2 = d.getName();
            String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
            _builder_3.append(_firstUpper_1, "");
            smethod.setName(_builder_3.toString());
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("void");
            smethod.setReturnType(_builder_4.toString());
            OParameter sparameter = OopFactoryImpl.eINSTANCE.createOParameter();
            String _name_3 = d.getName();
            String _firstLower = StringExtensions.toFirstLower(_name_3);
            sparameter.setName(_firstLower);
            ODataTypes _type_1 = d.getType();
            String _literal_1 = _type_1.getLiteral();
            sparameter.setType(_literal_1);
            EList<OParameter> _parameters = smethod.getParameters();
            _parameters.add(sparameter);
            OStatement _createOStatement = OopFactoryImpl.eINSTANCE.createOStatement();
            statement = _createOStatement;
            StringConcatenation _builder_5 = new StringConcatenation();
            _builder_5.append("this.");
            String _name_4 = d.getName();
            _builder_5.append(_name_4, "");
            _builder_5.append(" = ");
            String _name_5 = sparameter.getName();
            _builder_5.append(_name_5, "");
            _builder_5.append(";");
            statement.setContent(_builder_5.toString());
            EList<OStatement> _statements_1 = smethod.getStatements();
            _statements_1.add(statement);
            EList<OMethod> _methods_1 = oc.getMethods();
            _methods_1.add(smethod);
          }
        }
        EList<OFeature> _features_1 = oc.getFeatures();
        final Function1<OFeature, Boolean> _function_5 = new Function1<OFeature, Boolean>() {
          public Boolean apply(final OFeature of) {
            return Boolean.valueOf((of instanceof OReference));
          }
        };
        Iterable<OFeature> _filter_1 = IterableExtensions.<OFeature>filter(_features_1, _function_5);
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
            if ((f instanceof OReferenceMulti)) {
              boolean _isUniqueInstance = ((OReferenceMulti)f).isUniqueInstance();
              if (_isUniqueInstance) {
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("Set<");
                OClass _reference = ((OReferenceMulti)f).getReference();
                String _name_1 = _reference.getName();
                _builder_1.append(_name_1, "");
                _builder_1.append(">");
                gmethod.setReturnType(_builder_1.toString());
              } else {
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("List<");
                OClass _reference_1 = ((OReferenceMulti)f).getReference();
                String _name_2 = _reference_1.getName();
                _builder_2.append(_name_2, "");
                _builder_2.append(">");
                gmethod.setReturnType(_builder_2.toString());
              }
            } else {
              StringConcatenation _builder_3 = new StringConcatenation();
              OClass _reference_2 = f.getReference();
              String _name_3 = _reference_2.getName();
              _builder_3.append(_name_3, "");
              gmethod.setReturnType(_builder_3.toString());
            }
            OStatement statement = OopFactoryImpl.eINSTANCE.createOStatement();
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("return this.");
            String _name_4 = f.getName();
            _builder_4.append(_name_4, "");
            _builder_4.append(";");
            statement.setContent(_builder_4.toString());
            EList<OStatement> _statements = gmethod.getStatements();
            _statements.add(statement);
            EList<OMethod> _methods = oc.getMethods();
            _methods.add(gmethod);
            OMethod smethod = OopFactoryImpl.eINSTANCE.createOMethod();
            StringConcatenation _builder_5 = new StringConcatenation();
            _builder_5.append("set");
            String _name_5 = f.getName();
            String _firstUpper_1 = StringExtensions.toFirstUpper(_name_5);
            _builder_5.append(_firstUpper_1, "");
            smethod.setName(_builder_5.toString());
            StringConcatenation _builder_6 = new StringConcatenation();
            _builder_6.append("void");
            smethod.setReturnType(_builder_6.toString());
            OParameter sparameter = OopFactoryImpl.eINSTANCE.createOParameter();
            String _name_6 = f.getName();
            String _firstLower = StringExtensions.toFirstLower(_name_6);
            sparameter.setName(_firstLower);
            if ((f instanceof OReferenceMulti)) {
              boolean _isUniqueInstance_1 = ((OReferenceMulti)f).isUniqueInstance();
              if (_isUniqueInstance_1) {
                StringConcatenation _builder_7 = new StringConcatenation();
                _builder_7.append("TreeSet<");
                OClass _reference_3 = ((OReferenceMulti)f).getReference();
                String _name_7 = _reference_3.getName();
                _builder_7.append(_name_7, "");
                _builder_7.append(">");
                sparameter.setType(_builder_7.toString());
              } else {
                StringConcatenation _builder_8 = new StringConcatenation();
                _builder_8.append("List<");
                OClass _reference_4 = ((OReferenceMulti)f).getReference();
                String _name_8 = _reference_4.getName();
                _builder_8.append(_name_8, "");
                _builder_8.append(">");
                sparameter.setType(_builder_8.toString());
              }
            } else {
              StringConcatenation _builder_9 = new StringConcatenation();
              OClass _reference_5 = f.getReference();
              String _name_9 = _reference_5.getName();
              _builder_9.append(_name_9, "");
              sparameter.setType(_builder_9.toString());
            }
            EList<OParameter> _parameters = smethod.getParameters();
            _parameters.add(sparameter);
            OStatement _createOStatement = OopFactoryImpl.eINSTANCE.createOStatement();
            statement = _createOStatement;
            StringConcatenation _builder_10 = new StringConcatenation();
            _builder_10.append("this.");
            String _name_10 = f.getName();
            _builder_10.append(_name_10, "");
            _builder_10.append(" = ");
            String _name_11 = sparameter.getName();
            _builder_10.append(_name_11, "");
            _builder_10.append(";");
            statement.setContent(_builder_10.toString());
            EList<OStatement> _statements_1 = smethod.getStatements();
            _statements_1.add(statement);
            EList<OMethod> _methods_1 = oc.getMethods();
            _methods_1.add(smethod);
          }
        }
      }
    }
    Set<Map.Entry<EObject, EObject>> _entrySet_8 = oClasses.entrySet();
    for (final Map.Entry<EObject, EObject> e_8 : _entrySet_8) {
      {
        EObject _key = e_8.getKey();
        OClass oc = ((OClass) _key);
        EList<OFeature> _features = oc.getFeatures();
        final Function1<OFeature, Boolean> _function_4 = new Function1<OFeature, Boolean>() {
          public Boolean apply(final OFeature of) {
            boolean _and = false;
            if (!(of instanceof OReferenceMulti)) {
              _and = false;
            } else {
              boolean _isUniqueInstance = ((OReferenceMulti) of).isUniqueInstance();
              _and = _isUniqueInstance;
            }
            return Boolean.valueOf(_and);
          }
        };
        Iterable<OFeature> _filter = IterableExtensions.<OFeature>filter(_features, _function_4);
        for (final OFeature of : _filter) {
          {
            OReferenceMulti ref = ((OReferenceMulti) of);
            OMethod cmethod = OopFactoryImpl.eINSTANCE.createOMethod();
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("compareTo");
            cmethod.setName(_builder.toString());
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("int");
            cmethod.setReturnType(_builder_1.toString());
            cmethod.setIsOverride(true);
            OParameter sparameter = OopFactoryImpl.eINSTANCE.createOParameter();
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("o");
            sparameter.setName(_builder_2.toString());
            OClass _reference = ref.getReference();
            String _name = _reference.getName();
            sparameter.setType(_name);
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
              EList<OFeature> _features_1 = oc.getFeatures();
              for(final OFeature f : _features_1) {
                {
                  if ((f instanceof DataType)) {
                    {
                      DataTypes _type = ((DataType)f).getType();
                      boolean _equals = _type.equals(DataTypes.STRING);
                      if (_equals) {
                        _builder_3.append("//Strings follow this form");
                        _builder_3.newLine();
                        _builder_3.append("comparison = this.get");
                        String _name_1 = f.getName();
                        String _firstUpper = StringExtensions.toFirstUpper(_name_1);
                        _builder_3.append(_firstUpper, "");
                        _builder_3.append("().compareTo(o.get");
                        String _name_2 = f.getName();
                        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
                        _builder_3.append(_firstUpper_1, "");
                        _builder_3.append("());");
                        _builder_3.newLineIfNotEmpty();
                        _builder_3.append("if (comparison != EQUAL) return comparison;");
                        _builder_3.newLine();
                      } else {
                        DataTypes _type_1 = ((DataType)f).getType();
                        boolean _equals_1 = _type_1.equals(DataTypes.BOOLEAN);
                        if (_equals_1) {
                          _builder_3.append("//booleans follow this form");
                          _builder_3.newLine();
                          _builder_3.append("if (!this.get");
                          String _name_3 = f.getName();
                          String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
                          _builder_3.append(_firstUpper_2, "");
                          _builder_3.append(" && o.get");
                          String _name_4 = f.getName();
                          String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
                          _builder_3.append(_firstUpper_3, "");
                          _builder_3.append(") return BEFORE;");
                          _builder_3.newLineIfNotEmpty();
                          _builder_3.append("if (this.get");
                          String _name_5 = f.getName();
                          String _firstUpper_4 = StringExtensions.toFirstUpper(_name_5);
                          _builder_3.append(_firstUpper_4, "");
                          _builder_3.append(" && !o.get");
                          String _name_6 = f.getName();
                          String _firstUpper_5 = StringExtensions.toFirstUpper(_name_6);
                          _builder_3.append(_firstUpper_5, "");
                          _builder_3.append(") return AFTER;");
                          _builder_3.newLineIfNotEmpty();
                        } else {
                          DataTypes _type_2 = ((DataType)f).getType();
                          boolean _equals_2 = _type_2.equals(DataTypes.DOUBLE);
                          if (_equals_2) {
                            _builder_3.append("//primitive numbers follow this form");
                            _builder_3.newLine();
                            _builder_3.append("if (this.get");
                            String _name_7 = f.getName();
                            String _firstUpper_6 = StringExtensions.toFirstUpper(_name_7);
                            _builder_3.append(_firstUpper_6, "");
                            _builder_3.append(" < o.get");
                            String _name_8 = f.getName();
                            String _firstUpper_7 = StringExtensions.toFirstUpper(_name_8);
                            _builder_3.append(_firstUpper_7, "");
                            _builder_3.append(") return BEFORE;");
                            _builder_3.newLineIfNotEmpty();
                            _builder_3.append("if (this.get");
                            String _name_9 = f.getName();
                            String _firstUpper_8 = StringExtensions.toFirstUpper(_name_9);
                            _builder_3.append(_firstUpper_8, "");
                            _builder_3.append(" > o.get");
                            String _name_10 = f.getName();
                            String _firstUpper_9 = StringExtensions.toFirstUpper(_name_10);
                            _builder_3.append(_firstUpper_9, "");
                            _builder_3.append(") return AFTER;");
                            _builder_3.newLineIfNotEmpty();
                          } else {
                            DataTypes _type_3 = ((DataType)f).getType();
                            boolean _equals_3 = _type_3.equals(DataTypes.INTEGER);
                            if (_equals_3) {
                              _builder_3.append("//primitive numbers follow this form");
                              _builder_3.newLine();
                              _builder_3.append("if (this.get");
                              String _name_11 = f.getName();
                              String _firstUpper_10 = StringExtensions.toFirstUpper(_name_11);
                              _builder_3.append(_firstUpper_10, "");
                              _builder_3.append(" < o.get");
                              String _name_12 = f.getName();
                              String _firstUpper_11 = StringExtensions.toFirstUpper(_name_12);
                              _builder_3.append(_firstUpper_11, "");
                              _builder_3.append(") return BEFORE;");
                              _builder_3.newLineIfNotEmpty();
                              _builder_3.append("if (this.get");
                              String _name_13 = f.getName();
                              String _firstUpper_12 = StringExtensions.toFirstUpper(_name_13);
                              _builder_3.append(_firstUpper_12, "");
                              _builder_3.append(" > o.get");
                              String _name_14 = f.getName();
                              String _firstUpper_13 = StringExtensions.toFirstUpper(_name_14);
                              _builder_3.append(_firstUpper_13, "");
                              _builder_3.append(") return AFTER;");
                              _builder_3.newLineIfNotEmpty();
                            } else {
                              DataTypes _type_4 = ((DataType)f).getType();
                              boolean _equals_4 = _type_4.equals(DataTypes.LONG);
                              if (_equals_4) {
                                _builder_3.append("//primitive numbers follow this form");
                                _builder_3.newLine();
                                _builder_3.append("if (this.get");
                                String _name_15 = f.getName();
                                String _firstUpper_14 = StringExtensions.toFirstUpper(_name_15);
                                _builder_3.append(_firstUpper_14, "");
                                _builder_3.append(" < o.get");
                                String _name_16 = f.getName();
                                String _firstUpper_15 = StringExtensions.toFirstUpper(_name_16);
                                _builder_3.append(_firstUpper_15, "");
                                _builder_3.append(") return BEFORE;");
                                _builder_3.newLineIfNotEmpty();
                                _builder_3.append("if (this.get");
                                String _name_17 = f.getName();
                                String _firstUpper_16 = StringExtensions.toFirstUpper(_name_17);
                                _builder_3.append(_firstUpper_16, "");
                                _builder_3.append(" > o.get");
                                String _name_18 = f.getName();
                                String _firstUpper_17 = StringExtensions.toFirstUpper(_name_18);
                                _builder_3.append(_firstUpper_17, "");
                                _builder_3.append(") return AFTER;");
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
            OClass _reference_1 = ref.getReference();
            EList<OMethod> _methods = _reference_1.getMethods();
            _methods.add(cmethod);
          }
        }
      }
    }
  }
  
  public OFeature generateFeature(final Feature dt) {
    if (dt instanceof DataType) {
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
