package com.xinchen.adjustment;

import com.xinchen.adjustment.dao.LevelingProjectDao;
import com.xinchen.adjustment.levelingbean.LevelingProject;
import com.xinchen.adjustment.dao.BeanDaoImp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        System.out.print(LevelingProject.class);

        LevelingProject t = new LevelingProject();
        BeanDaoImp mBeanUtils = new LevelingProjectDao();
//        System.out.print(mBeanDao.getTClass());

        assertEquals(4, 2 + 2);
    }

    @Test
    public void aTestTest() throws Exception{
        assertEquals(4, 4);
    }
}