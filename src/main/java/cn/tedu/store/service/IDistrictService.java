package cn.tedu.store.service;

import java.util.List;
import java.util.Map;

import cn.tedu.store.entity.District;

/**
 * 处理省/市/区数据的业务层接口
 */
public interface IDistrictService {

	/**
	 * 根据父级代号获取全国所有省/某省所有市/某市所有区的列表
	 * @param parent 父级代号，如果尝试获取全国所有省，则代号应该使用"86"
	 * @return 全国所有省/某省所有市/某市所有区的列表
	 */
	List<District> getByParent(String parent);
	
	/**
	 * 根据省/市/区的代号查询详情
	 * @param code 省/市/区的代号
	 * @return 匹配的省/市/区的详情，如果没有匹配的数据，则返回null
	 */
	District getByCode(String code);

	/**
	 * 根据省，市代码查询 省市区所有数据
	 * @param provinceCode
	 * @param cityCode
	 */
	Map getAllData(String provinceCode, String cityCode);
}
