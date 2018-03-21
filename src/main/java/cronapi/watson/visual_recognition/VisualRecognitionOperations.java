package cronapi.watson.visual_recognition;

import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifiedImages;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.Classifier;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.Classifiers;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifyOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.CreateClassifierOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DeleteClassifierOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectFacesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectedFaces;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.GetClassifierOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ListClassifiersOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.UpdateClassifierOptions;
import cronapi.CronapiMetaData;
import java.util.Map;

@CronapiMetaData
public final class VisualRecognitionOperations {

  @CronapiMetaData
  public static ClassifiedImages classify(String versionDate, String apiKey, String endPoint,
      Map<String, String> headers, ClassifyOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);
    return service.classify(options).execute();
  }

  @CronapiMetaData
  public static DetectedFaces detectFaces(String versionDate, String apiKey, String endPoint,
      Map<String, String> headers, DetectFacesOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.detectFaces(options).execute();
  }

  @CronapiMetaData
  public static Classifier createClassifier(String versionDate, String apiKey, String endPoint,
      Map<String, String> headers, CreateClassifierOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createClassifier(options).execute();
  }

  @CronapiMetaData
  public static void deleteClassifier(String versionDate, String apiKey, String endPoint,
      Map<String, String> headers, DeleteClassifierOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteClassifier(options).execute();
  }

  @CronapiMetaData
  public static Classifier getClassifier(String versionDate, String apiKey, String endPoint,
      Map<String, String> headers, GetClassifierOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getClassifier(options).execute();
  }

  @CronapiMetaData
  public static Classifiers listClassifiers(String versionDate, String apiKey, String endPoint,
      Map<String, String> headers, ListClassifiersOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listClassifiers(options).execute();
  }

  @CronapiMetaData
  public static Classifier updateClassifier(String versionDate, String apiKey, String endPoint,
      Map<String, String> headers, UpdateClassifierOptions updateClassifierOptions) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateClassifier(updateClassifierOptions).execute();
  }
}