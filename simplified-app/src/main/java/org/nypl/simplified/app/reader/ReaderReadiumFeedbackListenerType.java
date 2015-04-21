package org.nypl.simplified.app.reader;

/**
 * Functions called via the <tt>host_app_feedback.js</tt> file using the
 * <tt>readium</tt> URI scheme.
 */

public interface ReaderReadiumFeedbackListenerType
{
  /**
   * Called when an exception is raised when trying to dispatch a function.
   */

  void onReadiumFunctionDispatchError(
    Throwable x);

  /**
   * Called on receipt of a <tt>readium:initialize</tt> request.
   */

  void onReadiumFunctionInitialize();

  /**
   * Called when {@link #onReadiumFunctionInitialize()} raises an exception.
   */

  void onReadiumFunctionInitializeError(
    Throwable e);

  /**
   * Called when an unknown request is made.
   */

  void onReadiumFunctionUnknown(
    String text);
}
