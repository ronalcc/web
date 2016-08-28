package admin.dao;

import admin.model.Sport;
import admin.model.SportExample;
import java.util.List;

import common.core.generic.GenericDao;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface SportMapper extends GenericDao{
}