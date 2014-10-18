package org.yazgel.titan.xtext.generator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.yazgel.oop.OClass;
import org.yazgel.oop.ODataType;
import org.yazgel.oop.ODataTypes;
import org.yazgel.oop.OFeature;
import org.yazgel.oop.OModel;
import org.yazgel.oop.OPackage;
import org.yazgel.oop.OReference;
import org.yazgel.oop.impl.OopFactoryImpl;
import org.yazgel.titan.xtext.titan.DataType;
import org.yazgel.titan.xtext.titan.DataTypes;
import org.yazgel.titan.xtext.titan.Entity;
import org.yazgel.titan.xtext.titan.Feature;
import org.yazgel.titan.xtext.titan.Module;
import org.yazgel.titan.xtext.titan.Reference;

@SuppressWarnings("all")
public class Titan2OopGenerator {
  private Map<EObject, EObject> transformationReleations = new HashMap<EObject, EObject>();
  
  public OModel doGenerate(final Module module) {
    OModel _xblockexpression = null;
    {
      OModel model = OopFactoryImpl.eINSTANCE.createOModel();
      String _name = module.getName();
      model.setName(_name);
      this.transformationReleations.put(model, module);
      this.transformationReleations.put(module, model);
      EList<org.yazgel.titan.xtext.titan.Package> _packages = module.getPackages();
      for (final org.yazgel.titan.xtext.titan.Package p : _packages) {
        EList<OPackage> _packages_1 = model.getPackages();
        OPackage _generate = this.generate(p);
        _packages_1.add(_generate);
      }
      EList<OPackage> oPackages = model.getPackages();
      for (final OPackage p_1 : oPackages) {
        {
          EList<OClass> oClasses = p_1.getClasses();
          for (final OClass c : oClasses) {
            {
              EObject _get = this.transformationReleations.get(c);
              Entity entity = ((Entity) _get);
              EList<Feature> tFeatures = entity.getFeatures();
              for (final Feature f : tFeatures) {
                EList<OFeature> _features = c.getFeatures();
                OFeature _generateFeature = this.generateFeature(f);
                _features.add(_generateFeature);
              }
            }
          }
        }
      }
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
      this.transformationReleations.put(oPackage, tPackage);
      this.transformationReleations.put(tPackage, oPackage);
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
      this.transformationReleations.put(oClass, entity);
      this.transformationReleations.put(entity, oClass);
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
      ODataType oDataType = OopFactoryImpl.eINSTANCE.createODataType();
      String _name = dt.getName();
      oDataType.setName(_name);
      this.transformationReleations.put(oDataType, dt);
      this.transformationReleations.put(dt, oDataType);
      boolean _isMany = dt.isMany();
      oDataType.setMany(_isMany);
      DataTypes _type = dt.getType();
      if (_type != null) {
        switch (_type) {
          case BOOLEAN:
            oDataType.setType(ODataTypes.BOOLEAN);
            break;
          case DOUBLE:
            oDataType.setType(ODataTypes.DOUBLE);
            break;
          case INTEGER:
            oDataType.setType(ODataTypes.INTEGER);
            break;
          case LONG:
            oDataType.setType(ODataTypes.LONG);
            break;
          case STRING:
            oDataType.setType(ODataTypes.STRING);
            break;
          default:
            break;
        }
      }
      _xblockexpression = oDataType;
    }
    return _xblockexpression;
  }
  
  protected OReference _generateFeature(final Reference r) {
    OReference _xblockexpression = null;
    {
      OReference oReference = OopFactoryImpl.eINSTANCE.createOReference();
      String _name = r.getName();
      oReference.setName(_name);
      this.transformationReleations.put(oReference, r);
      this.transformationReleations.put(r, oReference);
      boolean _isMany = r.isMany();
      oReference.setMany(_isMany);
      Entity _reference = r.getReference();
      EObject _get = this.transformationReleations.get(_reference);
      oReference.setReference(((OClass) _get));
      _xblockexpression = oReference;
    }
    return _xblockexpression;
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
