package cn.e3mall.service;

import cn.e3mall.common.pojo.EasyUIDataGridResult;
import cn.e3mall.common.utils.E3Result;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemDesc;

public interface ItemService {
	
	TbItem getItemById(Long itemId);
	
	EasyUIDataGridResult getItemList(int page,int rows);
	
	E3Result addItem(TbItem item,String desc);

	E3Result updateItem(TbItem item, String desc);

	E3Result getItemDescById(long id);

	E3Result paramItemQueryById(long id);

	E3Result deleteItem(long[] ids);
	
	TbItemDesc getItemDescribeById(long id);
}
