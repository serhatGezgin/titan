package org.yazgel.titan.xtext.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.yazgel.oop.OClass;
import org.yazgel.oop.OFeature;
import org.yazgel.oop.OMethod;
import org.yazgel.oop.OParameter;
import org.yazgel.oop.OStatement;
import org.yazgel.titan.xtext.generator.BaseGenerator2;

@SuppressWarnings("all")
public class EntityGenerator2 extends BaseGenerator2 {
  public void generateFile(final OClass oc, final IFileSystemAccess fsa) {
    String _oClassFileName = this.oClassFileName(oc);
    CharSequence _oClassContent = this.oClassContent(oc);
    fsa.generateFile(_oClassFileName, _oClassContent);
  }
  
  public CharSequence oClassContent(final OClass oc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _oClassPackageName = BaseGenerator2.oClassPackageName(oc);
    _builder.append(_oClassPackageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<String> _imports = oc.getImports();
      for(final String s : _imports) {
        _builder.append("import ");
        _builder.append(s, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("public class ");
    String _name = oc.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    CharSequence _oClassImplements = this.oClassImplements(oc);
    _builder.append(_oClassImplements, "");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<OFeature> _features = oc.getFeatures();
      for(final OFeature f : _features) {
        _builder.append("\t");
        _builder.append("private ");
        String _type = f.getType();
        _builder.append(_type, "\t");
        _builder.append(" ");
        String _name_1 = f.getName();
        _builder.append(_name_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<OMethod> _methods = oc.getMethods();
      for(final OMethod c : _methods) {
        {
          boolean _isOverride = c.isOverride();
          if (_isOverride) {
            _builder.append("\t");
            _builder.append("@Override");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("public ");
        String _oMethodAccessType = this.oMethodAccessType(c);
        _builder.append(_oMethodAccessType, "\t");
        _builder.append(" ");
        String _returnType = c.getReturnType();
        _builder.append(_returnType, "\t");
        _builder.append(" ");
        String _name_2 = c.getName();
        _builder.append(_name_2, "\t");
        _builder.append("(");
        CharSequence _oMethodParams = this.oMethodParams(c);
        _builder.append(_oMethodParams, "\t");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        {
          EList<OStatement> _statements = c.getStatements();
          for(final OStatement s_1 : _statements) {
            _builder.append("\t");
            _builder.append("\t");
            String _content = s_1.getContent();
            _builder.append(_content, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence oClassImplements(final OClass oc) {
    CharSequence _xblockexpression = null;
    {
      EList<String> _implements = oc.getImplements();
      boolean _isEmpty = _implements.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("implements ");
      {
        EList<String> _implements_1 = oc.getImplements();
        for(final String s : _implements_1) {
          _builder.append(s, "");
          {
            EList<String> _implements_2 = oc.getImplements();
            String _last = IterableExtensions.<String>last(_implements_2);
            boolean _equals = s.equals(_last);
            boolean _not = (!_equals);
            if (_not) {
              _builder.append(", ");
            }
          }
        }
      }
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public String oMethodAccessType(final OMethod om) {
    boolean _isStatic = om.isStatic();
    if (_isStatic) {
      return "static";
    }
    return "";
  }
  
  public CharSequence oMethodParams(final OMethod om) {
    CharSequence _xblockexpression = null;
    {
      EList<OParameter> _parameters = om.getParameters();
      boolean _isEmpty = _parameters.isEmpty();
      if (_isEmpty) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<OParameter> _parameters_1 = om.getParameters();
        for(final OParameter p : _parameters_1) {
          String _type = p.getType();
          _builder.append(_type, "");
          _builder.append(" ");
          String _name = p.getName();
          _builder.append(_name, "");
          {
            EList<OParameter> _parameters_2 = om.getParameters();
            OParameter _last = IterableExtensions.<OParameter>last(_parameters_2);
            boolean _equals = p.equals(_last);
            boolean _not = (!_equals);
            if (_not) {
              _builder.append(", ");
            }
          }
        }
      }
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
