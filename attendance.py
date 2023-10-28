import cv2
import face_recognition
import time
import tkinter as tk

# Load the known faces
known_faces = []
for image_file in os.listdir('known_faces'):
    known_face = face_recognition.load_image_file(os.path.join('known_faces', image_file))
    known_face_encoding = face_recognition.face_encodings(known_face)[0]
    known_faces.append(known_face_encoding)

# Initialize the webcam
cap = cv2.VideoCapture(0)

# Create a dialog box
root = tk.Tk()
root.withdraw()
dialog_box = tk.Toplevel(root)
dialog_box.title('Attendance Checker')
dialog_box.geometry('200x100')

# Create a label to display the message
message_label = tk.Label(dialog_box, text='Person is present!')
message_label.pack()

# Set a timer to close the dialog box after a certain amount of time
timer = time.Timer(5, dialog_box.destroy)
timer.start()

# Loop over the webcam frames
while True:
    # Capture the next frame
    ret, frame = cap.read()

    # Find all faces in the frame
    face_locations = face_recognition.face_locations(frame)

    # Loop over the detected faces
    for face_location in face_locations:
        # Extract the face encoding
        face_encoding = face_recognition.face_encodings(frame, face_locations)[0]

        # Match the face encoding to the known faces
        matches = face_recognition.compare_faces(known_faces, face_encoding)

        # If there is a match, mark the person as present
        if True in matches:
            message_label.config(text='Person is present!')
            timer.cancel()
            dialog_box.deiconify()
        else:
            message_label.config(text="Person's face is not in the file.")
            timer.cancel()
            dialog_box.deiconify()

    # Display the frame
    cv2.imshow('Attendance Checker', frame)

    # If the 'q' key is pressed, quit the program
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

# Release the webcam
cap.release()

# Close all windows
cv2.destroyAllWindows()
root.destroy()