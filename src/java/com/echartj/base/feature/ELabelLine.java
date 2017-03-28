/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base.feature;

import com.echartj.base.EBase;
import com.echartj.base.ENormalAemphasisLabel;

/**
 *
 * @author 小黑
 */
public class ELabelLine extends EBase {

    private ENormalAemphasisLabel normal;
    private ENormalAemphasisLabel emphasis;

    public ENormalAemphasisLabel getNormal() {
        return normal;
    }

    public void setNormal(ENormalAemphasisLabel normal) {
        this.normal = normal;
    }

    public ENormalAemphasisLabel getEmphasis() {
        return emphasis;
    }

    public void setEmphasis(ENormalAemphasisLabel emphasis) {
        this.emphasis = emphasis;
    }

}
