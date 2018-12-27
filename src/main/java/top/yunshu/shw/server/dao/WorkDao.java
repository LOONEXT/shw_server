package top.yunshu.shw.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.yunshu.shw.server.entity.Work;

import java.util.List;

/**
 * @author shulu
 */
public interface WorkDao extends JpaRepository<Work, String> {
    /**
     * 根据群组ID 查找所有作业
     *
     * @param groupId 群组ID
     * @return 作业集合
     */
    List<Work> findAllByGroupId(String groupId);
}
