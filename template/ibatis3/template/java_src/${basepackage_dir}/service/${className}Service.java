<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.service;   
import ${basepackage}.model.${className};

/**
 *  ${className}Service
 *
 * @version : Ver 1.0
 * @author	: <a href="mailto:hubo@95190.com">hubo</a>
 * @date	: 2015年5月17日 下午9:01:26 
 */
public interface ${className}Service extends BaseService<${className},${table.idColumn.javaType}>{

}
