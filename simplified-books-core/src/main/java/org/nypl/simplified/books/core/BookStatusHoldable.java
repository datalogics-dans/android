package org.nypl.simplified.books.core;

import com.io7m.jnull.NullCheck;

/**
 * The given book not available for loan, but may be placed on hold.
 */

public final class BookStatusHoldable implements BookStatusType
{
  private final BookID id;

  public BookStatusHoldable(
    final BookID in_id)
  {
    this.id = NullCheck.notNull(in_id);
  }

  @Override public BookID getID()
  {
    return this.id;
  }

  @Override public BookStatusPriorityOrdering getPriority()
  {
    return BookStatusPriorityOrdering.BOOK_STATUS_HOLDABLE;
  }

  @Override public <A, E extends Exception> A matchBookStatus(
    final BookStatusMatcherType<A, E> m)
    throws E
  {
    return m.onBookStatusHoldable(this);
  }

  @Override public String toString()
  {
    final StringBuilder b = new StringBuilder();
    b.append("[BookStatusHoldable ");
    b.append(this.id);
    b.append("]");
    return NullCheck.notNull(b.toString());
  }
}
