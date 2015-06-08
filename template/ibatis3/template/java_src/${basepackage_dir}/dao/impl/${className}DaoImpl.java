<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.dao.impl;  
import ${basepackage}.dao.${className}Dao; 
import ${basepackage}.model.${className};
import org.springframework.stereotype.Service;

/**
 *  ${className}Dao
 *
 * @version : Ver 1.0
 * @author	: <a href="mailto:hubo@95190.com">hubo</a>
 * @date	: 2015年5月17日 下午9:01:26 
 */
@Service
public class ${className}DaoImpl extends MybatisBaseDaoImpl<${className}, ${table.idColumn.javaType}> implements ${className}Dao { 

}
