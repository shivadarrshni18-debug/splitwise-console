
/**
 * Creates a new expense record.
 *
 * @param payerName Name of the person who paid.
 * @param amount Amount paid.
 */

package model;
/**
 * one expense row
 * @param payerName name of the person
 * @param amount amount paid
 */


  public record ExpenseLine (String payerName, double amount){

  }

