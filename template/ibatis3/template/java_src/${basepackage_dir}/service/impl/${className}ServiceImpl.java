<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.service.impl;  
import ${basepackage}.service.${className}Service;
import ${basepackage}.service.impl.MybatisBaseServiceImpl;
import ${basepackage}.model.${className};
import org.springframework.stereotype.Service;

/**
 *  ${className}ServiceImpl
 *
 * @version : Ver 1.0
 * @author	: <a href="mailto:hubo@95190.com">hubo</a>
 * @date	: 2015年5月17日 下午9:01:26 
 */
@Service
public class ${className}ServiceImpl extends MybatisBaseServiceImpl<${className}, ${table.idColumn.javaType}> implements ${className}Service { 

}
