package com.me.assessment2.mock3;

/**
 * interface that calculates tax for taxable objects
 */
public interface Taxable {
    /**
     * constant tax rate variable
     */
    double TAX_RATE = 0.05;

    /**
     * calculates tax for taxable objects
     * @return the tax amount for a taxable object
     */
    public double getTax();
}
