package org.yazgel.titan.xtext.generator;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
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
  public OModel doGenerate(final Module module) {
    OModel _xblockexpression = null;
    {
      OModel model = OopFactoryImpl.eINSTANCE.createOModel();
      String _name = module.getName();
      model.setName(_name);
      EList<org.yazgel.titan.xtext.titan.Package> _packages = module.getPackages();
      for (final org.yazgel.titan.xtext.titan.Package p : _packages) {
        EList<OPackage> _packages_1 = model.getPackages();
        OPackage _generate = this.generate(p);
        _packages_1.add(_generate);
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
      EList<Feature> features = entity.getFeatures();
      for (final Feature f : features) {
        EList<OFeature> _features = oClass.getFeatures();
        OFeature _generateFeature = this.generateFeature(f);
        _features.add(_generateFeature);
      }
      _xblockexpression = oClass;
    }
    return _xblockexpression;
  }
  
  protected ODataType _generateFeature(final DataType dt) {
    ODataType _xblockexpression = null;
    {
      ODataType oDataType = OopFactoryImpl.eINSTANCE.createODataType();
      String _name = dt.getName();
      oDataType.setName(_name);
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
      boolean _isMany = r.isMany();
      oReference.setMany(_isMany);
      _xblockexpression = oReference;
    }
    return _xblockexpression;
  }
  
  public OFeature generateFeature(final Feature dt) {
    if (dt instanceof DataType) {
      return _generateFeature((DataType)dt);
    } else if (dt instanceof Reference) {
      return _generateFeature((Reference)dt);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(dt).toString());
    }
  }
}
