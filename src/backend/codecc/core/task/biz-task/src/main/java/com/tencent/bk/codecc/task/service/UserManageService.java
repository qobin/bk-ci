/*
 * Tencent is pleased to support the open source community by making BK-CODECC 蓝鲸代码检查平台 available.
 *
 * Copyright (C) 2019 THL A29 Limited, a Tencent company.  All rights reserved.
 *
 * BK-CODECC 蓝鲸代码检查平台 is licensed under the MIT license.
 *
 * A copy of the MIT License is included in this file.
 *
 *
 * Terms of the MIT License:
 * ---------------------------------------------------
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.tencent.bk.codecc.task.service;

import com.tencent.bk.codecc.task.vo.DevopsProjectOrgVO;
import com.tencent.bk.codecc.task.vo.DevopsProjectVO;
import com.tencent.devops.common.api.pojo.CodeCCResult;

import java.util.List;

/**
 * 用户管理逻辑处理
 *
 * @version V1.0
 * @date 2019/4/23
 */
public interface UserManageService
{
    CodeCCResult getInfo(String userId);

    /**
     * 获取项目信息
     *
     * @param accessToken
     * @return
     */
    List<DevopsProjectVO> getProjectList(String userId, String accessToken);

    /**
     * 获取蓝盾项目组织架构信息
     *
     * @param projectId 蓝盾项目ID
     * @return org
     */
    DevopsProjectOrgVO getDevopsProjectOrg(String projectId);
}